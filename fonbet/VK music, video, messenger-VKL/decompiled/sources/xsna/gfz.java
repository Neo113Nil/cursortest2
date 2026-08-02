package xsna;

import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;

/* compiled from: ListItem.kt */
/* loaded from: classes17.dex */
public final class gfz extends vu0 {
    public final int b;
    public final ModalActionSheetListItem.Appearance c;
    public final String d;
    public final int e;
    public final gzs<s3q0> f;

    public /* synthetic */ gfz(int i, String str, int i2, gzs gzsVar) {
        this(i, ModalActionSheetListItem.Appearance.Default, str, i2, gzsVar);
    }

    @Override // xsna.vu0
    public final yu20 a() {
        return new ModalActionSheetListItem(this.b, this.c, this.d, null, null, this.e, null, false, false, 472);
    }

    @Override // xsna.vu0
    public final void b() {
        this.f.invoke();
    }

    public gfz(int i, ModalActionSheetListItem.Appearance appearance, String str, int i2, gzs<s3q0> gzsVar) {
        super(i);
        this.b = i;
        this.c = appearance;
        this.d = str;
        this.e = i2;
        this.f = gzsVar;
    }
}
