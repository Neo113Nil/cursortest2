package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes11.dex */
public final class pwb0 extends Lambda implements gzs<Boolean> {
    final /* synthetic */ owb0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwb0(owb0 owb0Var) {
        super(0);
        this.this$0 = owb0Var;
    }

    @Override // xsna.gzs
    public final Boolean invoke() {
        tny parentLayoutCoordinates;
        parentLayoutCoordinates = this.this$0.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.e()) {
            parentLayoutCoordinates = null;
        }
        return Boolean.valueOf((parentLayoutCoordinates == null || this.this$0.m414getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
