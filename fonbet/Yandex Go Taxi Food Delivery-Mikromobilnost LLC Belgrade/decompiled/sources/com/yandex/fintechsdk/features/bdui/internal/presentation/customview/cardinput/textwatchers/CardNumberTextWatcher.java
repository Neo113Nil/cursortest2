package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.textwatchers;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.a;
import defpackage.fk8;
import defpackage.nk8;
import defpackage.tk8;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.HexString;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0012\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/textwatchers/CardNumberTextWatcher;", "Landroid/text/TextWatcher;", "Lnk8;", "listener", "Ltk8;", "cardNumberFormatter", "<init>", "(Lnk8;Ltk8;)V", "", "s", "", "start", "count", "after", "Lzy11;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "editable", "afterTextChanged", "(Landroid/text/Editable;)V", "Lnk8;", "Ltk8;", "", "prevText", "Ljava/lang/String;", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardNumberTextWatcher implements TextWatcher {
    private final tk8 cardNumberFormatter;
    private final nk8 listener;
    private String prevText;

    public /* synthetic */ CardNumberTextWatcher(nk8 nk8Var, tk8 tk8Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nk8Var, (i & 2) != 0 ? new tk8(0) : tk8Var);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        tk8 tk8Var = this.cardNumberFormatter;
        String obj = editable.toString();
        StringBuilder sb = new StringBuilder();
        int length = obj.length();
        for (int i = 0; i < length; i++) {
            tk8Var.getClass();
            char charAt = obj.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        fk8 fk8Var = tk8Var.a.a(sb2).b;
        List list = fk8Var.b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() >= sb2.length()) {
                    break;
                }
            }
        }
        fk8Var = null;
        if (fk8Var != null) {
            List list2 = fk8Var.d;
            if (!list2.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                int size = list2.size();
                int length2 = sb2.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length2; i3++) {
                    char charAt2 = sb2.charAt(i3);
                    if (i2 < size && i3 == ((Number) list2.get(i2)).intValue()) {
                        sb3.append(HexString.CHAR_SPACE);
                        i2++;
                    }
                    sb3.append(charAt2);
                }
                sb2 = sb3.toString();
            }
        } else {
            sb2 = null;
        }
        if (sb2 == null) {
            editable.setFilters(new InputFilter[0]);
            editable.replace(0, editable.length(), this.prevText);
            ((a) this.listener).c(this.prevText);
            return;
        }
        if (sb2.equals(this.prevText)) {
            return;
        }
        this.prevText = sb2;
        editable.setFilters(new InputFilter[0]);
        editable.replace(0, editable.length(), sb2);
        ((a) this.listener).c(sb2);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }

    public CardNumberTextWatcher(nk8 nk8Var, tk8 tk8Var) {
        this.listener = nk8Var;
        this.cardNumberFormatter = tk8Var;
        this.prevText = "";
    }
}
