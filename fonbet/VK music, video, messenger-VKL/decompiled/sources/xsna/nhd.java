package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.VideoFeatures;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: ClipsAuthorsExperimentsImpl.kt */
/* loaded from: classes16.dex */
public final class nhd implements mhd {
    public static final /* synthetic */ qcy<Object>[] t;
    public final Context a;
    public final boolean b;
    public final b25 c;
    public final boolean d;
    public final izs<b.a, b.a> e;
    public final boolean f;
    public final gwy g;
    public final gwy h;
    public final gwy i;
    public final gwy j;
    public final gwy l;
    public final gwy n;
    public final gwy o;
    public final gwy p;
    public final gwy q;
    public final gwy r;
    public final gwy s;
    public final gwy k = f(this, Features.Type.FEATURE_CLIPS_LINKS_IN_PUBLISH);
    public final gwy m = f(this, ClipsFeatures.NEW_VIEWS_FORMAT);

    /* compiled from: ClipsAuthorsExperimentsImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(((b25) this.receiver).b());
        }
    }

    /* compiled from: ClipsAuthorsExperimentsImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<UserId> {
        @Override // xsna.gzs
        public final UserId invoke() {
            return ((b25) this.receiver).L();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(nhd.class, "isCreateAvailable", "isCreateAvailable()Z", 0);
        hpf0 hpf0Var = fpf0.a;
        t = new qcy[]{propertyReference1Impl, fp.c(0, nhd.class, "isEffectsAvailable", "isEffectsAvailable()Z", hpf0Var), ep.a(0, nhd.class, "clipsMaxDurationSec", "getClipsMaxDurationSec()Ljava/lang/Integer;", hpf0Var), ep.a(0, nhd.class, "priorityEffects", "getPriorityEffects()Ljava/util/ArrayList;", hpf0Var), ep.a(0, nhd.class, "isLinksInPublishEnabled", "isLinksInPublishEnabled()Z", hpf0Var), ep.a(0, nhd.class, "audioDecoderBufferOptimization", "getAudioDecoderBufferOptimization()Lcom/vk/clips/config/authors/api/experiments/models/ClipsAudioDecoderBufferOptimizationConfig;", hpf0Var), ep.a(0, nhd.class, "isNewViewsFormatEnabled", "isNewViewsFormatEnabled()Z", hpf0Var), ep.a(0, nhd.class, "isEnableTwoWayPagination", "isEnableTwoWayPagination()Z", hpf0Var), ep.a(0, nhd.class, "pipelineBitrateReworkEnabled", "getPipelineBitrateReworkEnabled()Z", hpf0Var), ep.a(0, nhd.class, "newUploader", "getNewUploader()Z", hpf0Var), ep.a(0, nhd.class, "isTrendsFullscreenEnabled", "isTrendsFullscreenEnabled()Z", hpf0Var), ep.a(0, nhd.class, "isPostToMainTabEnabled", "isPostToMainTabEnabled()Z", hpf0Var), ep.a(0, nhd.class, "isProfilePostingRedesignEnabled", "isProfilePostingRedesignEnabled()Z", hpf0Var), ep.a(0, nhd.class, "isNewDraftSdkEnabled", "isNewDraftSdkEnabled()Z", hpf0Var), ep.a(0, nhd.class, "isNewUploadRulesDisclaimerEnabled", "isNewUploadRulesDisclaimerEnabled()Z", hpf0Var)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nhd(Context context, boolean z, b25 b25Var, boolean z2, izs<? super b.a, ? extends b.a> izsVar, boolean z3) {
        this.a = context;
        this.b = z;
        this.c = b25Var;
        this.d = z2;
        this.e = izsVar;
        this.f = z3;
        this.g = a(b25Var, new hd(this, 17));
        this.h = a(b25Var, new se0(11));
        int i = 1;
        this.i = a(b25Var, new gs1(new dh5(6), this, Features.Type.FEATURE_CLIPS_CUSTOM_MAX_DURATION, i));
        this.j = a(b25Var, new gs1(new cj1(10), this, Features.Type.FEATURE_CLIPS_PRIORITY_EFFECTS, i));
        this.l = a(b25Var, new gs1(new dj1(12), this, ClipsFeatures.CLIPS_AUDIO_DECODER_OPTIMIZATION, i));
        f(this, ClipsFeatures.CLIPS_ENABLE_TWO_WAY_PAGINATION);
        this.n = f(this, ClipsFeatures.CLIPS_PIPELINE_BITRATE_REWORK);
        this.o = f(this, ClipsFeatures.CLIPS_NEW_UPLOADER);
        f(this, ClipsFeatures.CLIPS_TRENDS_FULLSCREEN);
        this.p = f(this, ComFeatures.COM_MAIN_TAB);
        this.q = f(this, ComFeatures.COM_PROFILE_POSTING_REDESIGN);
        this.r = f(this, ClipsFeatures.CLIPS_NEW_DRAFT_SDK_ENABLED);
        this.s = f(this, ClipsFeatures.CLIPS_NEW_UPLOAD_RULES_DISCLAIMER);
    }

    public static gwy a(b25 b25Var, gzs gzsVar) {
        return new gwy(new a(0, b25Var, b25.class, "isLoggedIn", "isLoggedIn()Z", 0), new b(0, b25Var, b25.class, "getCurrentOwnerUid", "getCurrentOwnerUid()Lcom/vk/dto/common/id/UserId;", 0), gzsVar);
    }

    public static gwy f(nhd nhdVar, b.a aVar) {
        return a(nhdVar.c, new dp0(5, nhdVar, aVar));
    }

    @Override // xsna.mhd
    public final Integer b() {
        return (Integer) this.i.getValue(this, t[2]);
    }

    @Override // xsna.mhd
    public final boolean c() {
        return ((Boolean) this.g.getValue(this, t[0])).booleanValue();
    }

    @Override // xsna.mhd
    public final sgd d() {
        return (sgd) this.l.getValue(this, t[5]);
    }

    @Override // xsna.mhd
    public final ArrayList<Integer> e() {
        return (ArrayList) this.j.getValue(this, t[3]);
    }

    @Override // xsna.mhd
    public final boolean g() {
        return ((Boolean) this.h.getValue(this, t[1])).booleanValue();
    }

    @Override // xsna.mhd
    public final boolean h() {
        return ((Boolean) this.m.getValue(this, t[6])).booleanValue();
    }

    @Override // xsna.mhd
    public final boolean i() {
        return ((Boolean) this.s.getValue(this, t[14])).booleanValue();
    }

    @Override // xsna.mhd
    public final boolean j() {
        return ((Boolean) this.r.getValue(this, t[13])).booleanValue();
    }

    @Override // xsna.mhd
    public final boolean k() {
        return ((Boolean) this.o.getValue(this, t[9])).booleanValue();
    }

    @Override // xsna.mhd
    public final boolean l() {
        return ((Boolean) this.p.getValue(this, t[11])).booleanValue();
    }

    @Override // xsna.mhd
    public final boolean m() {
        return ((Boolean) this.n.getValue(this, t[8])).booleanValue();
    }

    @Override // xsna.mhd
    public final boolean n() {
        if (!this.f) {
            return false;
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIP_ATTACH_VIDEO;
        videoFeatures.getClass();
        return com.vk.toggle.b.A.a(videoFeatures);
    }

    @Override // xsna.mhd
    public final boolean o() {
        return ((Boolean) this.q.getValue(this, t[12])).booleanValue();
    }

    @Override // xsna.mhd
    public final boolean p() {
        return ((Boolean) this.k.getValue(this, t[4])).booleanValue();
    }
}
