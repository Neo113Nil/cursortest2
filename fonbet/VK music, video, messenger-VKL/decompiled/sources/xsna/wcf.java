package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$AutoRepostToStoryWithLikes;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$DelayedPublication;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$TrendingHashtags;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalNumber;
import com.vk.toggle.features.VideoFeatures;
import java.util.Set;
import java.util.SimpleTimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.mjf;

/* compiled from: ClipsUploadAsyncLoadExecutor.kt */
/* loaded from: classes17.dex */
public final class wcf extends uvj<ClipsUploadState, Object, mjf.a, mjf, ugf, qef> {
    public final nn50<ClipsUploadState, Object, mjf, ugf, qef> g;
    public final ukf h;
    public final agf i;
    public final lod j;
    public final x9e k;
    public final uwe l;
    public final mhd m;
    public final zkf n;
    public final zye o;
    public final com.vk.clips.upload.vk.ui.api.a p;
    public final kwo q;
    public final mud r;
    public final h7v s;
    public final q7v0 t;
    public final Set<Object> u;
    public final ytl0 v;

    public wcf(nk50 nk50Var, nn50<ClipsUploadState, Object, mjf, ugf, qef> nn50Var, ukf ukfVar, agf agfVar, lod lodVar, x9e x9eVar, uwe uweVar, mhd mhdVar, zkf zkfVar, zye zyeVar, com.vk.clips.upload.vk.ui.api.a aVar, kwo kwoVar, mud mudVar, h7v h7vVar, q7v0 q7v0Var, Set<Object> set) {
        super(nk50Var, nn50Var);
        this.g = nn50Var;
        this.h = ukfVar;
        this.i = agfVar;
        this.j = lodVar;
        this.k = x9eVar;
        this.l = uweVar;
        this.m = mhdVar;
        this.n = zkfVar;
        this.o = zyeVar;
        this.p = aVar;
        this.q = kwoVar;
        this.r = mudVar;
        this.s = h7vVar;
        this.t = q7v0Var;
        this.u = set;
        this.v = new ytl0(q7v0Var, this.f, new k7f(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(wcf wcfVar, mjf.a.o oVar, boolean z, ContinuationImpl continuationImpl) {
        sbf sbfVar;
        int i;
        mjf.a.o oVar2;
        ConditionalNumber<Long> conditionalNumber;
        Long l;
        wcfVar.getClass();
        if (continuationImpl instanceof sbf) {
            sbfVar = (sbf) continuationImpl;
            int i2 = sbfVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sbfVar.label = i2 - Integer.MIN_VALUE;
                Object obj = sbfVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sbfVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ConditionalNumber<Long> conditionalNumber2 = oVar.b.e.j;
                    mud mudVar = wcfVar.r;
                    sbfVar.L$0 = oVar;
                    sbfVar.L$1 = conditionalNumber2;
                    sbfVar.L$2 = wcfVar;
                    sbfVar.Z$0 = z;
                    sbfVar.label = 1;
                    Object a = mudVar.a(sbfVar);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    oVar2 = oVar;
                    conditionalNumber = conditionalNumber2;
                    obj = a;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = sbfVar.Z$0;
                    wcfVar = (wcf) sbfVar.L$2;
                    conditionalNumber = (ConditionalNumber) sbfVar.L$1;
                    oVar2 = (mjf.a.o) sbfVar.L$0;
                    kotlin.a.a(obj);
                }
                ClipsDraftVk clipsDraftVk = (ClipsDraftVk) obj;
                wcfVar.getClass();
                Long l2 = null;
                l = clipsDraftVk == null ? clipsDraftVk.b.o : null;
                if (l != null) {
                    long longValue = l.longValue();
                    SimpleTimeZone simpleTimeZone = pvo0.a;
                    xuo0.a.getClass();
                    if (longValue >= xuo0.a() && l.longValue() != 0) {
                        l2 = l;
                    }
                }
                ConditionalNumber.State state = oVar2.b.f.contains(ClipUploadScreenFeature$DelayedPublication.b) ? ConditionalNumber.State.HIDDEN : z ? ConditionalNumber.State.DISABLED : ConditionalNumber.State.SHOWN;
                conditionalNumber.getClass();
                return new ConditionalNumber(l2, state);
            }
        }
        sbfVar = new sbf(wcfVar, continuationImpl);
        Object obj2 = sbfVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sbfVar.label;
        if (i != 0) {
        }
        ClipsDraftVk clipsDraftVk2 = (ClipsDraftVk) obj2;
        wcfVar.getClass();
        Long l22 = null;
        if (clipsDraftVk2 == null) {
        }
        if (l != null) {
        }
        if (oVar2.b.f.contains(ClipUploadScreenFeature$DelayedPublication.b)) {
        }
        conditionalNumber.getClass();
        return new ConditionalNumber(l22, state);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Enum v(wcf wcfVar, zrl zrlVar, ContinuationImpl continuationImpl) {
        tbf tbfVar;
        int i;
        wcfVar.getClass();
        if (continuationImpl instanceof tbf) {
            tbfVar = (tbf) continuationImpl;
            int i2 = tbfVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tbfVar.label = i2 - Integer.MIN_VALUE;
                Object obj = tbfVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tbfVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (!wcfVar.m.p()) {
                        return ConditionalFeature.State.HIDDEN;
                    }
                    tbfVar.L$0 = null;
                    tbfVar.label = 1;
                    obj = zrlVar.H(tbfVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Boolean) obj).booleanValue() ? ConditionalFeature.State.DISABLED : ConditionalFeature.State.SHOWN;
            }
        }
        tbfVar = new tbf(wcfVar, continuationImpl);
        Object obj2 = tbfVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tbfVar.label;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }

    @Override // xsna.dl50, xsna.mn50
    public final boolean B(hn50 hn50Var) {
        ClipsUploadState.Loaded loaded;
        ClipsUploadDataInternal clipsUploadDataInternal;
        ClipsUploadDataInternal clipsUploadDataInternal2;
        ClipsUploadDataInternal clipsUploadDataInternal3;
        mjf.a aVar = (mjf.a) hn50Var;
        boolean z = aVar instanceof mjf.a.o;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z) {
            if (nn50Var.getCurrentState() instanceof ClipsUploadState.Loaded) {
                return false;
            }
        } else {
            if ((aVar instanceof mjf.a.i) || (aVar instanceof mjf.a.p) || (aVar instanceof mjf.a.n) || aVar.equals(mjf.a.q.b) || aVar.equals(mjf.a.h.b)) {
                return nn50Var.getCurrentState() instanceof ClipsUploadState.Loaded;
            }
            if (!(aVar instanceof mjf.a.c)) {
                if (aVar.equals(mjf.a.e.b)) {
                    lm50 currentState = nn50Var.getCurrentState();
                    loaded = currentState instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState : null;
                    if (loaded != null) {
                        return loaded.i;
                    }
                    return false;
                }
                boolean equals = aVar.equals(mjf.a.l.b);
                Set<Object> set = this.u;
                if (equals) {
                    if (!(nn50Var.getCurrentState() instanceof ClipsUploadState.Loaded) || !set.contains(ClipUploadScreenFeature$TrendingHashtags.b)) {
                        return false;
                    }
                } else {
                    if (aVar instanceof mjf.a.m) {
                        return nn50Var.getCurrentState() instanceof ClipsUploadState.Loaded;
                    }
                    if (!(aVar instanceof mjf.a.r)) {
                        if (aVar instanceof mjf.a.g) {
                            return nn50Var.getCurrentState() instanceof ClipsUploadState.Loaded;
                        }
                        if (aVar.equals(mjf.a.j.b)) {
                            return set.contains(ClipUploadScreenFeature$AutoRepostToStoryWithLikes.b);
                        }
                        if (aVar.equals(mjf.a.f.b)) {
                            lm50 currentState2 = nn50Var.getCurrentState();
                            loaded = currentState2 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState2 : null;
                            if (loaded == null || (clipsUploadDataInternal3 = loaded.b) == null || !clipsUploadDataInternal3.e.f.c) {
                                return false;
                            }
                        } else {
                            if (aVar instanceof mjf.a.C3346a) {
                                return nn50Var.getCurrentState() instanceof ClipsUploadState.Loaded;
                            }
                            if (aVar.equals(mjf.a.d.b)) {
                                lm50 currentState3 = nn50Var.getCurrentState();
                                loaded = currentState3 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState3 : null;
                                if (loaded == null || (clipsUploadDataInternal2 = loaded.b) == null || !clipsUploadDataInternal2.d.l.c) {
                                    return false;
                                }
                            } else {
                                if (aVar.equals(mjf.a.k.b)) {
                                    lm50 currentState4 = nn50Var.getCurrentState();
                                    loaded = currentState4 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState4 : null;
                                    if (loaded == null || (clipsUploadDataInternal = loaded.b) == null) {
                                        return false;
                                    }
                                    return clipsUploadDataInternal.e.s;
                                }
                                if (!aVar.equals(mjf.a.b.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (!(nn50Var.getCurrentState() instanceof ClipsUploadState.Loaded)) {
                                    return false;
                                }
                                VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIP_ATTACH_ONBOARDING;
                                videoFeatures.getClass();
                                if (!com.vk.toggle.b.A.a(videoFeatures)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            } else if (!(nn50Var.getCurrentState() instanceof ClipsUploadState.Loaded) || !this.m.p()) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        mjf.a aVar = (mjf.a) hn50Var;
        boolean z = aVar instanceof mjf.a.o;
        nk50 nk50Var = this.d;
        hpj hpjVar = this.f;
        if (z) {
            mjf.a.o oVar = (mjf.a.o) aVar;
            return m(myc0.h(hpjVar, nk50Var.c().plus(new ybf(this, oVar)).plus(iyx.a()), null, new zbf(this, oVar, null), 2));
        }
        if (aVar instanceof mjf.a.i) {
            return m(myc0.h(hpjVar, nk50Var.c().plus(iyx.a()), null, new icf(this, (mjf.a.i) aVar, null), 2));
        }
        if (aVar instanceof mjf.a.p) {
            return m(myc0.h(hpjVar, nk50Var.c().plus(iyx.a()).plus(new rcf(this)), null, new scf(this, (mjf.a.p) aVar, null), 2));
        }
        if (aVar instanceof mjf.a.c) {
            return m(myc0.h(hpjVar, nk50Var.c().plus(iyx.a()), null, new acf(this, (mjf.a.c) aVar, null), 2));
        }
        if (aVar instanceof mjf.a.q) {
            return m(myc0.h(hpjVar, nk50Var.c().plus(iyx.a()), null, new tcf(this, null), 2));
        }
        if (aVar instanceof mjf.a.e) {
            return m(myc0.h(hpjVar, nk50Var.c().plus(iyx.a()), null, new ccf(this, null), 2));
        }
        if (aVar instanceof mjf.a.h) {
            return m(myc0.h(hpjVar, nk50Var.c().plus(iyx.a()), null, new hcf(this, null), 2));
        }
        if (aVar instanceof mjf.a.l) {
            return m(myc0.h(hpjVar, nk50Var.c().plus(iyx.a()), null, new lcf(this, null), 2));
        }
        if (aVar instanceof mjf.a.n) {
            return m(myc0.h(hpjVar, nk50Var.c().plus(iyx.a()).plus(new pcf(this)), null, new qcf(this, (mjf.a.n) aVar, null), 2));
        }
        if (aVar instanceof mjf.a.m) {
            return m(myc0.h(hpjVar, nk50Var.c().plus(iyx.a()).plus(new ncf(this)), null, new ocf(this, (mjf.a.m) aVar, null), 2));
        }
        if (aVar instanceof mjf.a.r) {
            return m(myc0.h(hpjVar, nk50Var.c().plus(iyx.a()).plus(new ucf(this)), null, new vcf(this, (mjf.a.r) aVar, null), 2));
        }
        if (aVar instanceof mjf.a.g) {
            return m(myc0.h(hpjVar, nk50Var.c().plus(iyx.a()).plus(new fcf(this)), null, new gcf(this, null), 2));
        }
        if (aVar instanceof mjf.a.f) {
            return m(myc0.h(hpjVar, nk50Var.c().plus(iyx.a()).plus(new dcf(this)), null, new ecf(this, null), 2));
        }
        if (aVar instanceof mjf.a.C3346a) {
            return m(myc0.h(hpjVar, nk50Var.c().plus(new wbf(this)), null, new xbf(this, ((mjf.a.C3346a) aVar).b, null), 2));
        }
        if (aVar instanceof mjf.a.d) {
            return m(myc0.h(hpjVar, null, null, new bcf(this, null), 3));
        }
        if (aVar.equals(mjf.a.j.b)) {
            ytl0 ytl0Var = this.v;
            return m(myc0.h(ytl0Var.b, null, null, new xtl0(ytl0Var, null), 3));
        }
        if (aVar instanceof mjf.a.k) {
            return m(myc0.h(hpjVar, nk50Var.c().plus(iyx.a()).plus(new jcf(this)), null, new kcf(this, null), 2));
        }
        if (aVar instanceof mjf.a.b) {
            return m(myc0.h(hpjVar, nk50Var.c().plus(iyx.a()).plus(new ubf(this)), null, new vbf(this, null), 2));
        }
        throw new NoWhenBranchMatchedException();
    }
}
