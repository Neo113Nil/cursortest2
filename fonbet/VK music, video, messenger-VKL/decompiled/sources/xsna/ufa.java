package xsna;

import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import com.vkontakte.android.R;
import xsna.bfa;
import xsna.mih0;
import xsna.oa70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ufa implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ ufa(int i, int i2, izs izsVar) {
        this.b = i2;
        this.c = izsVar;
        this.d = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(new bfa.b(this.d));
                return s3q0.a;
            case 1:
                ((izs) this.c).invoke(new oa70.g(this.d));
                return s3q0.a;
            case 2:
                ((izs) this.c).invoke(Integer.valueOf(this.d));
                return s3q0.a;
            default:
                ((mih0.i) this.c).getClass();
                return new BaseBadgeHolder.a.C0709a(this.d, R.attr.vk_ui_icon_contrast);
        }
    }

    public /* synthetic */ ufa(int i, mih0.i iVar) {
        this.b = 3;
        this.d = i;
        this.c = iVar;
    }
}
