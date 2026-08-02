package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Attachment;
import com.vk.newsfeed.common.posting.attachments.AttachmentsNewsEntry;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a1u0;
import xsna.u3e0;

/* compiled from: PreviewPostMediaStep2Content.kt */
/* loaded from: classes4.dex */
public final class c5d0 {
    public izs<? super PostingAction, s3q0> a = new z6u(12);
    public final a2o b;
    public mdc0 c;
    public final pcc0 d;
    public final mu9 e;
    public int f;
    public boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final lw20 m;
    public final Handler n;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e6, code lost:
    
        if (xsna.bwt0.K(r6) == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c5d0(roc0 roc0Var, a2o a2oVar) {
        this.b = a2oVar;
        ybc0 ybc0Var = new ybc0();
        this.c = new mdc0(PhotoVideoDisplayMode.Carousel, true);
        this.e = new mu9(ybc0Var, new s6x(22), new pb8(8));
        pq10 pq10Var = new pq10(false, false, false, false, false);
        cpc0 cpc0Var = new cpc0();
        int b = cn70.b(248);
        this.g = true;
        this.h = cn70.b(2);
        this.i = cn70.b(32);
        this.j = cn70.b(PsExtractor.AUDIO_STREAM);
        this.k = cn70.b(52);
        this.l = cn70.b(44);
        b5d0 b5d0Var = new b5d0(this);
        a5d0 a5d0Var = new a5d0(this);
        ybc0Var.a = new zq70().k();
        pcc0 pcc0Var = new pcc0(a5d0Var, new z4d0(this, 0), ybc0Var, null, b5d0Var, new g6b(ybc0Var), this.a, pq10Var, cpc0Var, a2oVar, new a1u0.b(false), 8);
        u1c0 u1c0Var = new u1c0(5, new AttachmentsNewsEntry(EmptyList.b));
        u1c0Var.g = "preview_holder";
        pcc0Var.x0(u1c0Var);
        pcc0Var.createViewHolder(roc0Var, pcc0Var.getItemViewType(0));
        this.d = pcc0Var;
        a4d0 a4d0Var = pcc0Var.n.g;
        if (a4d0Var != null) {
            VkButton vkButton = a4d0Var.M;
            FrameLayout frameLayout = a4d0Var.L;
            if (frameLayout != null) {
                bwt0.p0(frameLayout, false);
            }
            if (vkButton != null) {
                bwt0.p0(vkButton, false);
            }
            View view = a4d0Var.K;
            if (view != null) {
                boolean z = vkButton != null ? true : z;
                z = false;
                bwt0.p0(view, z);
            }
        }
        pcc0Var.Q0(b);
        roc0Var.setAdapter(pcc0Var);
        roc0Var.getContext();
        roc0Var.setLayoutManager(new LinearLayoutManager());
        roc0Var.setNestedScrollingEnabled(false);
        roc0Var.addItemDecoration(new l2c0());
        this.m = new lw20(this, 22);
        this.n = new Handler(Looper.getMainLooper());
    }

    public final void a(Attachment attachment, UploadDto.UploadState uploadState) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        UploadDto.UploadStep uploadStep = uploadState.b;
        boolean f = epx.f(uploadStep, UploadDto.UploadStep.Uploading.b);
        pcc0 pcc0Var = this.d;
        if (f) {
            int i = uploadState.f;
            int b = an10.b(100 * (i == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : uploadState.e / i));
            if (pcc0Var != null) {
                u3e0.e eVar = new u3e0.e(b, !hg10.l(this.c));
                a4d0 a4d0Var = pcc0Var.n.g;
                if (a4d0Var != null) {
                    Iterator it = a4d0Var.G.o.iterator();
                    while (it.hasNext()) {
                        ce6 ce6Var = (ce6) it.next();
                        if (epx.f(ce6Var.c, attachment) && (ce6Var instanceof ykw)) {
                            ((ykw) ce6Var).r(eVar);
                        } else if (epx.f(ce6Var.c, attachment) && (ce6Var instanceof uu90)) {
                            ((uu90) ce6Var).r(eVar);
                        } else if (epx.f(ce6Var.c, attachment) && (ce6Var instanceof mps0)) {
                            mps0 mps0Var = (mps0) ce6Var;
                            mps0Var.h.a(eVar);
                            a1u0 a1u0Var = mps0Var.f;
                            if (a1u0Var instanceof a1u0.a) {
                                z5 = true;
                            } else {
                                if (!(a1u0Var instanceof a1u0.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                boolean z6 = a1u0Var.a;
                                z5 = false;
                            }
                            mps0Var.g.a(z5);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!(attachment instanceof cvz)) {
            if (pcc0Var != null) {
                u3e0.c cVar = u3e0.c.a;
                a4d0 a4d0Var2 = pcc0Var.n.g;
                if (a4d0Var2 != null) {
                    Iterator it2 = a4d0Var2.G.o.iterator();
                    while (it2.hasNext()) {
                        ce6 ce6Var2 = (ce6) it2.next();
                        if (epx.f(ce6Var2.c, attachment) && (ce6Var2 instanceof ykw)) {
                            ((ykw) ce6Var2).r(cVar);
                        } else if (epx.f(ce6Var2.c, attachment) && (ce6Var2 instanceof uu90)) {
                            ((uu90) ce6Var2).r(cVar);
                        } else if (epx.f(ce6Var2.c, attachment) && (ce6Var2 instanceof mps0)) {
                            mps0 mps0Var2 = (mps0) ce6Var2;
                            mps0Var2.h.a(cVar);
                            a1u0 a1u0Var2 = mps0Var2.f;
                            if (a1u0Var2 instanceof a1u0.a) {
                                z4 = true;
                            } else {
                                if (!(a1u0Var2 instanceof a1u0.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                boolean z7 = a1u0Var2.a;
                                z4 = false;
                            }
                            mps0Var2.g.a(z4);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (epx.f(uploadStep, UploadDto.UploadStep.Idle.b) || epx.f(uploadStep, UploadDto.UploadStep.Uploaded.b)) {
            if (pcc0Var != null) {
                u3e0.a aVar = u3e0.a.a;
                a4d0 a4d0Var3 = pcc0Var.n.g;
                if (a4d0Var3 != null) {
                    Iterator it3 = a4d0Var3.G.o.iterator();
                    while (it3.hasNext()) {
                        ce6 ce6Var3 = (ce6) it3.next();
                        if (epx.f(ce6Var3.c, attachment) && (ce6Var3 instanceof ykw)) {
                            ((ykw) ce6Var3).r(aVar);
                        } else if (epx.f(ce6Var3.c, attachment) && (ce6Var3 instanceof uu90)) {
                            ((uu90) ce6Var3).r(aVar);
                        } else if (epx.f(ce6Var3.c, attachment) && (ce6Var3 instanceof mps0)) {
                            mps0 mps0Var3 = (mps0) ce6Var3;
                            mps0Var3.h.a(aVar);
                            a1u0 a1u0Var3 = mps0Var3.f;
                            if (a1u0Var3 instanceof a1u0.a) {
                                z = true;
                            } else {
                                if (!(a1u0Var3 instanceof a1u0.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                boolean z8 = a1u0Var3.a;
                                z = false;
                            }
                            mps0Var3.g.a(z);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!(uploadStep instanceof UploadDto.UploadStep.Failed)) {
            if (pcc0Var != null) {
                u3e0.d dVar = u3e0.d.a;
                a4d0 a4d0Var4 = pcc0Var.n.g;
                if (a4d0Var4 != null) {
                    Iterator it4 = a4d0Var4.G.o.iterator();
                    while (it4.hasNext()) {
                        ce6 ce6Var4 = (ce6) it4.next();
                        if (epx.f(ce6Var4.c, attachment) && (ce6Var4 instanceof ykw)) {
                            ((ykw) ce6Var4).r(dVar);
                        } else if (epx.f(ce6Var4.c, attachment) && (ce6Var4 instanceof uu90)) {
                            ((uu90) ce6Var4).r(dVar);
                        } else if (epx.f(ce6Var4.c, attachment) && (ce6Var4 instanceof mps0)) {
                            mps0 mps0Var4 = (mps0) ce6Var4;
                            mps0Var4.h.a(dVar);
                            a1u0 a1u0Var4 = mps0Var4.f;
                            if (a1u0Var4 instanceof a1u0.a) {
                                z2 = true;
                            } else {
                                if (!(a1u0Var4 instanceof a1u0.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                boolean z9 = a1u0Var4.a;
                                z2 = false;
                            }
                            mps0Var4.g.a(z2);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (pcc0Var != null) {
            u3e0.b bVar = new u3e0.b(!hg10.l(this.c));
            a4d0 a4d0Var5 = pcc0Var.n.g;
            if (a4d0Var5 != null) {
                Iterator it5 = a4d0Var5.G.o.iterator();
                while (it5.hasNext()) {
                    ce6 ce6Var5 = (ce6) it5.next();
                    if (epx.f(ce6Var5.c, attachment) && (ce6Var5 instanceof ykw)) {
                        ((ykw) ce6Var5).r(bVar);
                    } else if (epx.f(ce6Var5.c, attachment) && (ce6Var5 instanceof uu90)) {
                        ((uu90) ce6Var5).r(bVar);
                    } else if (epx.f(ce6Var5.c, attachment) && (ce6Var5 instanceof mps0)) {
                        mps0 mps0Var5 = (mps0) ce6Var5;
                        mps0Var5.h.a(bVar);
                        a1u0 a1u0Var5 = mps0Var5.f;
                        if (!(a1u0Var5 instanceof a1u0.a)) {
                            if (!(a1u0Var5 instanceof a1u0.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (a1u0Var5.a) {
                                z3 = false;
                                mps0Var5.g.a(z3);
                            }
                        }
                        z3 = true;
                        mps0Var5.g.a(z3);
                    }
                }
            }
        }
    }
}
