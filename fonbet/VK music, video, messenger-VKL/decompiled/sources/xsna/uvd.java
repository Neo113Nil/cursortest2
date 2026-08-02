package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.attachments.api.di.ClipsAttachmentsComponent;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.clips.edit.impl.deps.features.ClipEditVkFeatures;
import com.vk.clips.sdk.common.provider.ClipsComposeImageLoader;
import com.vk.clips.upload.edit.api.ClipsUploadSdkEditComponent;
import com.vk.clips.upload.ui.api.di.ClipsUploadSdkUiComponent;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkComponent;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import java.io.File;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.vtc;

/* compiled from: ClipsEditVkDeps.kt */
/* loaded from: classes16.dex */
public final class uvd implements fof {
    public final ClipsUploadSdkUiComponent a;
    public final bpn0 b;
    public final bpn0 c;
    public final bpn0 h;
    public final bpn0 i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final bpn0 m;
    public final bpn0 q;
    public final bpn0 r;
    public final bpn0 d = new bpn0(new n1(11));
    public final bpn0 e = new bpn0(new a44(7));
    public final bpn0 f = new bpn0(new de4(8));
    public final bpn0 g = new bpn0(new ee4(5));
    public final bpn0 n = new bpn0(new px0(this, 17));
    public final bpn0 o = new bpn0(new com.vk.movika.sdk.base.ui.t(this, 22));
    public final bpn0 p = new bpn0(new sx0(this, 14));
    public final bpn0 s = new bpn0(new y6(this, 21));

    /* compiled from: ClipsEditVkDeps.kt */
    public static final class a implements msc {
        public final /* synthetic */ ClipsUploadSdkUploaderComponent a;

        public a(ClipsUploadSdkUploaderComponent clipsUploadSdkUploaderComponent) {
            this.a = clipsUploadSdkUploaderComponent;
        }

        @Override // xsna.msc
        public final void a(File file, ClipUploaderData.Author author, int i, vtc.a aVar) {
            ClipsUploadSdkUploaderComponent clipsUploadSdkUploaderComponent = this.a;
            l9f a = clipsUploadSdkUploaderComponent.k().f().a().a(file, author, i, new tvd(aVar));
            clipsUploadSdkUploaderComponent.k().f().c().getClass();
            com.vk.upload.impl.a.i(a);
        }
    }

    /* compiled from: ClipsEditVkDeps.kt */
    public static final class b implements gof {
        @Override // xsna.gof
        public final Object a(xy2 xy2Var, SuspendLambda suspendLambda) {
            return oxo0.b(1500L, new vvd(xy2Var, true, null), suspendLambda);
        }
    }

    public uvd(ClipsUploadSdkEditComponent clipsUploadSdkEditComponent, ClipsUploadSdkUiComponent clipsUploadSdkUiComponent, ClipsUploadSdkUploaderComponent clipsUploadSdkUploaderComponent, ClipsAttachmentsComponent clipsAttachmentsComponent, ClipsCoauthorsComponent clipsCoauthorsComponent, ClipsUploadUiVkComponent clipsUploadUiVkComponent, BridgeComponent bridgeComponent, ClipEditComponent clipEditComponent, Set<? extends ClipEditVkFeatures> set) {
        this.a = clipsUploadSdkUiComponent;
        this.b = new bpn0(new m1(clipsAttachmentsComponent, 23));
        this.c = new bpn0(new rj1(clipsAttachmentsComponent, 21));
        this.h = new bpn0(new we0(clipsUploadSdkEditComponent, 18));
        this.i = new bpn0(new s1(clipsUploadSdkUploaderComponent, 22));
        this.j = new bpn0(new ww(7, this, set));
        this.k = new bpn0(new com.vk.movika.sdk.base.ui.p(4, this, set));
        this.l = new bpn0(new svd(clipsCoauthorsComponent, this, set, 0));
        this.m = new bpn0(new ca(clipEditComponent, 21));
        this.q = new bpn0(new com.vk.movika.sdk.base.ui.z(2, this, bridgeComponent));
        this.r = new bpn0(new com.vk.movika.sdk.base.logic.interactor.c(9, clipsUploadUiVkComponent, set));
    }

    @Override // xsna.fof
    public final gof a() {
        return (gof) this.g.getValue();
    }

    @Override // xsna.fof
    public final uw50 b() {
        return (uw50) this.s.getValue();
    }

    @Override // xsna.fof
    public final jvd c() {
        return (jvd) this.j.getValue();
    }

    @Override // xsna.fof
    public final cuc d() {
        return (cuc) this.r.getValue();
    }

    @Override // xsna.fof
    public final msc e() {
        return (msc) this.i.getValue();
    }

    @Override // xsna.fof
    public final nld f() {
        return null;
    }

    @Override // xsna.fof
    public final jsc g() {
        return (jsc) this.l.getValue();
    }

    @Override // xsna.fof
    public final ClipsComposeImageLoader h() {
        return (ClipsComposeImageLoader) this.o.getValue();
    }

    @Override // xsna.fof
    public final fvd i() {
        return (fvd) this.m.getValue();
    }

    @Override // xsna.fof
    public final e9e j() {
        return (e9e) this.n.getValue();
    }

    @Override // xsna.fof
    public final nvd k() {
        return (nvd) this.k.getValue();
    }

    @Override // xsna.fof
    public final g2f l() {
        return (g2f) this.p.getValue();
    }

    @Override // xsna.fof
    public final jqd m() {
        return (jqd) this.h.getValue();
    }
}
