package com.ybsdk.widgets.common;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.ybsdk.core.utils.InputFilterHelper;
import defpackage.evu0;
import defpackage.gvu0;
import defpackage.m020;
import defpackage.sls;
import defpackage.sq20;
import defpackage.wu40;
import defpackage.y530;

/* loaded from: classes12.dex */
public final class j {
    public static final y530 a = new y530(0);

    public static void a(EditText editText, final boolean z, final boolean z2, m020 m020Var, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        sls slsVar = m020Var;
        if ((i & 8) != 0) {
            slsVar = new sq20(29);
        }
        editText.setFilters(new InputFilterHelper[]{new InputFilterHelper(new wu40(7, slsVar))});
        editText.addTextChangedListener(new TextWatcher(z, z2) { // from class: com.ybsdk.widgets.common.MoneyInputSetup$TextNormalizer
            private final boolean allowDecimal;
            private boolean isSelfEdit;
            private final boolean zeroIfEmpty;

            {
                this.zeroIfEmpty = z;
                this.allowDecimal = z2;
            }

            private final void addDefaultPrefix(Editable s) {
                s.insert(0, "0");
            }

            private final void normalizeDefaultPrefix(Editable s) {
                int length = s.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (s.charAt(i2) != '0') {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 == -1) {
                    s.replace(0, s.length(), "0");
                } else if (Character.isDigit(s.charAt(i2))) {
                    s.delete(0, i2);
                } else if (i2 > 1) {
                    s.replace(0, i2, "0");
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                Character w0;
                if (this.isSelfEdit) {
                    return;
                }
                this.isSelfEdit = true;
                if (!this.allowDecimal) {
                    int i2 = -1;
                    if (s != null) {
                        int length = s.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            char charAt = s.charAt(i3);
                            if (charAt == ',' || charAt == '.') {
                                i2 = i3;
                                break;
                            }
                        }
                    }
                    if (i2 >= 0 && s != null) {
                        s.delete(i2, evu0.C(s));
                    }
                }
                if (s != null) {
                    if ((s.length() == 0 && this.zeroIfEmpty) || !((w0 = gvu0.w0(0, s)) == null || Character.isDigit(w0.charValue()))) {
                        addDefaultPrefix(s);
                    } else if (evu0.a0(s, MoneyInputEditView.DEFAULT_VALUE) && s.length() > 1) {
                        normalizeDefaultPrefix(s);
                    }
                }
                this.isSelfEdit = false;
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
    }
}
