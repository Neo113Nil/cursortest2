package xsna;

import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;

/* compiled from: MidscreenBannerItem.kt */
/* loaded from: classes18.dex */
public abstract class em20 implements pgm {
    public final DialogsListAdapter.ViewType b = DialogsListAdapter.ViewType.MIDSCREEN_BANNER;

    /* compiled from: MidscreenBannerItem.kt */
    public static final class a extends em20 {
        public static final a c = new a();
    }

    /* compiled from: MidscreenBannerItem.kt */
    public static final class b extends em20 {
        public static final b c = new b();
    }

    /* compiled from: MidscreenBannerItem.kt */
    public static final class c extends em20 {
        public static final c c = new c();
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.ordinal());
    }

    @Override // xsna.pgm
    public final DialogsListAdapter.ViewType l() {
        return this.b;
    }
}
