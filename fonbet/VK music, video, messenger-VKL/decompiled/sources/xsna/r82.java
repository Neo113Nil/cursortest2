package xsna;

import android.view.autofill.AutofillValue;

/* compiled from: FillableData.android.kt */
/* loaded from: classes11.dex */
public final class r82 implements xbr {
    public final AutofillValue a;

    public r82(AutofillValue autofillValue) {
        this.a = autofillValue;
    }

    @Override // xsna.xbr
    public final Boolean a() {
        AutofillValue autofillValue = this.a;
        if (autofillValue.isToggle()) {
            return Boolean.valueOf(autofillValue.getToggleValue());
        }
        return null;
    }

    @Override // xsna.xbr
    public final CharSequence b() {
        AutofillValue autofillValue = this.a;
        if (autofillValue.isText()) {
            return autofillValue.getTextValue();
        }
        return null;
    }
}
