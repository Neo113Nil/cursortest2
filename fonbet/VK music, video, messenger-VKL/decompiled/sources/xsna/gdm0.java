package xsna;

import com.vk.stickers.api.models.market.StoryServiceItemInfo;
import com.vk.stickers.api.styles.ServiceStickerStyle;
import java.util.List;
import xsna.hdm0;

/* compiled from: StoryServicePreviewPresenter.kt */
/* loaded from: classes16.dex */
public final class gdm0 implements uyl0 {
    public final bdm0 b;
    public final ddm0 c;
    public final bpn0 d;
    public idm0 e;

    public gdm0(bdm0 bdm0Var, ddm0 ddm0Var, StoryServiceItemInfo storyServiceItemInfo) {
        this.b = bdm0Var;
        this.c = ddm0Var;
        bpn0 bpn0Var = new bpn0(new fd90(10));
        this.d = bpn0Var;
        this.e = new idm0(storyServiceItemInfo, ((List) bpn0Var.getValue()).size() > 1, (hdm0) j5g.Y((List) bpn0Var.getValue()), 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r2 == null) goto L17;
     */
    @Override // xsna.uyl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X1(nov novVar) {
        hdm0 hdm0Var;
        StoryServiceItemInfo storyServiceItemInfo;
        edm0 edm0Var = novVar instanceof edm0 ? (edm0) novVar : null;
        if (edm0Var != null) {
            hdm0Var = edm0Var.getInfo().e == StoryServiceItemInfo.Style.Sticker ? hdm0.a.c : edm0Var.getStyle() == ServiceStickerStyle.Sticker ? hdm0.b.c : hdm0.b.c;
        }
        hdm0Var = this.e.e;
        hdm0 hdm0Var2 = hdm0Var;
        idm0 idm0Var = this.e;
        int indexOf = ((List) this.d.getValue()).indexOf(hdm0Var2);
        boolean f = epx.f(novVar != null ? Boolean.valueOf(novVar.getInEditMode()) : null, Boolean.TRUE);
        boolean z = true;
        if (novVar != null && novVar.getInEditMode()) {
            z = false;
        }
        boolean z2 = z;
        if (edm0Var == null || (storyServiceItemInfo = edm0Var.getInfo()) == null) {
            storyServiceItemInfo = this.e.b;
        }
        StoryServiceItemInfo storyServiceItemInfo2 = storyServiceItemInfo;
        idm0Var.getClass();
        idm0 idm0Var2 = new idm0(indexOf, storyServiceItemInfo2, f, z2, hdm0Var2);
        this.e = idm0Var2;
        this.b.h(idm0Var2);
    }

    @Override // xsna.uyl0
    public final void k() {
        StoryServiceItemInfo storyServiceItemInfo;
        idm0 idm0Var = this.e;
        StoryServiceItemInfo storyServiceItemInfo2 = idm0Var.b;
        hdm0 hdm0Var = idm0Var.e;
        if (storyServiceItemInfo2 != null) {
            storyServiceItemInfo = new StoryServiceItemInfo(storyServiceItemInfo2.a, storyServiceItemInfo2.b, storyServiceItemInfo2.c, storyServiceItemInfo2.d, hdm0Var.b);
        } else {
            storyServiceItemInfo = null;
        }
        ServiceStickerStyle serviceStickerStyle = hdm0Var.a;
        ddm0 ddm0Var = this.c;
        if (storyServiceItemInfo != null) {
            ddm0Var.k(storyServiceItemInfo, serviceStickerStyle);
        }
        ddm0Var.c.f();
        this.b.dismiss();
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.uyl0
    public final void onStart() {
        this.b.h(this.e);
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.uyl0
    public final void onStop() {
    }
}
