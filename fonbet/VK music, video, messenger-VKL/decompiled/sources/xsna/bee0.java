package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BasePrivacyDto;
import com.vk.api.generated.video.dto.VideoOrdInfoDto;
import com.vk.api.generated.video.dto.VideoSubtitlesDto;
import com.vk.api.generated.video.dto.VideoTimelineThumbsDto;
import com.vk.api.generated.video.dto.VideoVideoDto;
import com.vk.api.generated.video.dto.VideoVideoForEditDto;
import com.vk.api.generated.video.dto.VideoVideoForEditTimelineThumbDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import com.vk.api.generated.video.dto.VideoVideoTypeDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PublishNetworkApiImpl.kt */
/* loaded from: classes7.dex */
public final class bee0 implements cde0 {
    public final uft0 a;
    public final zqu b;
    public final dy2 c;
    public asl d;

    public bee0(uft0 uft0Var, zqu zquVar, dy2 dy2Var) {
        this.a = uft0Var;
        this.b = zquVar;
        this.c = dy2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(bee0 bee0Var, ContinuationImpl continuationImpl) {
        nde0 nde0Var;
        int i;
        bee0Var.getClass();
        if (continuationImpl instanceof nde0) {
            nde0Var = (nde0) continuationImpl;
            int i2 = nde0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nde0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = nde0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nde0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    ode0 ode0Var = new ode0(bee0Var, null);
                    nde0Var.label = 1;
                    obj = myc0.k(b, ode0Var, nde0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        nde0Var = new nde0(bee0Var, continuationImpl);
        Object obj2 = nde0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nde0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(bee0 bee0Var, String str, ContinuationImpl continuationImpl) {
        tde0 tde0Var;
        int i;
        bee0Var.getClass();
        if (continuationImpl instanceof tde0) {
            tde0Var = (tde0) continuationImpl;
            int i2 = tde0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tde0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = tde0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tde0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    ude0 ude0Var = new ude0(str, null, bee0Var);
                    tde0Var.L$0 = null;
                    tde0Var.label = 1;
                    obj = myc0.k(b, ude0Var, tde0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        tde0Var = new tde0(bee0Var, continuationImpl);
        Object obj2 = tde0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tde0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    public static final VideoVideoFullDto m(bee0 bee0Var, VideoVideoForEditDto videoVideoForEditDto, int i, UserId userId) {
        ArrayList arrayList;
        VideoTimelineThumbsDto videoTimelineThumbsDto;
        bee0Var.getClass();
        String title = videoVideoForEditDto.getTitle();
        VideoVideoTypeDto videoVideoTypeDto = VideoVideoTypeDto.VIDEO;
        String description = videoVideoForEditDto.getDescription();
        int duration = videoVideoForEditDto.getDuration();
        Integer l = videoVideoForEditDto.l();
        Boolean C = videoVideoForEditDto.C();
        BaseBoolIntDto baseBoolIntDto = C != null ? C.booleanValue() ? BaseBoolIntDto.YES : BaseBoolIntDto.NO : null;
        String n = videoVideoForEditDto.n();
        List<VideoVideoDto> e = videoVideoForEditDto.e();
        if (e != null) {
            List<VideoVideoDto> list = e;
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            for (VideoVideoDto videoVideoDto : list) {
                arrayList2.add(new VideoVideoFullDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, videoVideoDto.getDescription(), videoVideoDto.a0(), videoVideoDto.y0(), null, null, null, videoVideoDto.w0(), videoVideoDto.q(), null, null, null, videoVideoDto.getTitle(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -8989, -1, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        ActionLinksActionDto d = videoVideoForEditDto.d();
        VideoOrdInfoDto i2 = videoVideoForEditDto.i();
        List<VideoSubtitlesDto> o = videoVideoForEditDto.o();
        BasePrivacyDto k = videoVideoForEditDto.k();
        BasePrivacyDto j = videoVideoForEditDto.j();
        Integer f = videoVideoForEditDto.f();
        List<VideoVideoImageDto> g = videoVideoForEditDto.g();
        List<VideoVideoForEditTimelineThumbDto> B = videoVideoForEditDto.B();
        Integer p = videoVideoForEditDto.p();
        int intValue = (p == null && (p = videoVideoForEditDto.u()) == null) ? 0 : p.intValue();
        if (B == null) {
            videoTimelineThumbsDto = null;
        } else {
            VideoVideoForEditTimelineThumbDto videoVideoForEditTimelineThumbDto = (VideoVideoForEditTimelineThumbDto) j5g.b0(intValue, B);
            if (videoVideoForEditTimelineThumbDto == null) {
                videoVideoForEditTimelineThumbDto = (VideoVideoForEditTimelineThumbDto) j5g.a0(B);
            }
            videoTimelineThumbsDto = new VideoTimelineThumbsDto(null, null, null, null, null, videoVideoForEditTimelineThumbDto != null ? Collections.singletonList(videoVideoForEditTimelineThumbDto.getUrl()) : EmptyList.b, null, null);
        }
        return new VideoVideoFullDto(null, null, null, null, null, null, k, j, null, videoTimelineThumbsDto, null, d, null, o, null, null, null, null, null, null, null, n, null, null, null, null, null, null, null, null, null, null, null, null, i2, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, baseBoolIntDto, null, null, description, Integer.valueOf(duration), g, null, null, null, Integer.valueOf(i), userId, null, null, null, title, null, null, null, null, null, null, null, null, null, null, null, null, videoVideoTypeDto, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l, null, null, null, null, f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2108097, 2147483635, -67117853, -69206017, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.cde0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        lde0 lde0Var;
        int i;
        if (continuationImpl instanceof lde0) {
            lde0Var = (lde0) continuationImpl;
            int i2 = lde0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lde0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = lde0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lde0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    asl aslVar = this.d;
                    if (aslVar != null) {
                        if (!aslVar.isActive()) {
                            aslVar = null;
                        }
                        if (aslVar != null) {
                            lde0Var.label = 1;
                            obj = aslVar.J(lde0Var);
                        }
                    }
                    mde0 mde0Var = new mde0(this, null);
                    lde0Var.label = 2;
                    obj = zvj.d(mde0Var, lde0Var);
                } else {
                    if (i == 1) {
                        kotlin.a.a(obj);
                        return ((Result) obj).d();
                    }
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return ((Result) obj).d();
                    }
                    kotlin.a.a(obj);
                    lde0Var.label = 3;
                    obj = ((zrl) obj).H(lde0Var);
                }
            }
        }
        lde0Var = new lde0(this, continuationImpl);
        Object obj2 = lde0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lde0Var.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.cde0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(UserId userId, int i, int i2, ContinuationImpl continuationImpl) {
        hde0 hde0Var;
        int i3;
        if (continuationImpl instanceof hde0) {
            hde0Var = (hde0) continuationImpl;
            int i4 = hde0Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                hde0Var.label = i4 - Integer.MIN_VALUE;
                Object obj = hde0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = hde0Var.label;
                if (i3 != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    ide0 ide0Var = new ide0(this, userId, i, i2, null);
                    hde0Var.L$0 = null;
                    hde0Var.I$0 = i;
                    hde0Var.I$1 = i2;
                    hde0Var.label = 1;
                    obj = myc0.k(b, ide0Var, hde0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        hde0Var = new hde0(this, continuationImpl);
        Object obj2 = hde0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = hde0Var.label;
        if (i3 != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.cde0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(VideoFile videoFile, ContinuationImpl continuationImpl) {
        pde0 pde0Var;
        int i;
        if (continuationImpl instanceof pde0) {
            pde0Var = (pde0) continuationImpl;
            int i2 = pde0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pde0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = pde0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pde0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    qde0 qde0Var = new qde0(videoFile, this, null);
                    pde0Var.L$0 = null;
                    pde0Var.label = 1;
                    obj = myc0.k(b, qde0Var, pde0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        pde0Var = new pde0(this, continuationImpl);
        Object obj2 = pde0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pde0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.cde0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        rde0 rde0Var;
        int i;
        if (continuationImpl instanceof rde0) {
            rde0Var = (rde0) continuationImpl;
            int i2 = rde0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rde0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = rde0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rde0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    sde0 sde0Var = new sde0(str, null, this);
                    rde0Var.L$0 = null;
                    rde0Var.label = 1;
                    obj = myc0.k(b, sde0Var, rde0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        rde0Var = new rde0(this, continuationImpl);
        Object obj2 = rde0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rde0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.cde0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ois0 ois0Var, ContinuationImpl continuationImpl) {
        xde0 xde0Var;
        int i;
        if (continuationImpl instanceof xde0) {
            xde0Var = (xde0) continuationImpl;
            int i2 = xde0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xde0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = xde0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = xde0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    yde0 yde0Var = new yde0(ois0Var, this, null);
                    xde0Var.L$0 = null;
                    xde0Var.label = 1;
                    obj = myc0.k(b, yde0Var, xde0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        xde0Var = new xde0(this, continuationImpl);
        Object obj2 = xde0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xde0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.cde0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(VideoFile videoFile, UserId userId, ContinuationImpl continuationImpl) {
        jde0 jde0Var;
        int i;
        if (continuationImpl instanceof jde0) {
            jde0Var = (jde0) continuationImpl;
            int i2 = jde0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jde0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = jde0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jde0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    kde0 kde0Var = new kde0(this, videoFile, userId, null);
                    jde0Var.L$0 = null;
                    jde0Var.L$1 = null;
                    jde0Var.label = 1;
                    obj = myc0.k(b, kde0Var, jde0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        jde0Var = new jde0(this, continuationImpl);
        Object obj2 = jde0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jde0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.cde0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(UserId userId, ContinuationImpl continuationImpl) {
        vde0 vde0Var;
        int i;
        if (continuationImpl instanceof vde0) {
            vde0Var = (vde0) continuationImpl;
            int i2 = vde0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vde0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = vde0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vde0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    wde0 wde0Var = new wde0(this, userId, null);
                    vde0Var.L$0 = null;
                    vde0Var.label = 1;
                    obj = myc0.k(b, wde0Var, vde0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        vde0Var = new vde0(this, continuationImpl);
        Object obj2 = vde0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vde0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.cde0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ois0 ois0Var, ContinuationImpl continuationImpl) {
        fde0 fde0Var;
        int i;
        if (continuationImpl instanceof fde0) {
            fde0Var = (fde0) continuationImpl;
            int i2 = fde0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fde0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = fde0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fde0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    gde0 gde0Var = new gde0(ois0Var, this, null);
                    fde0Var.L$0 = null;
                    fde0Var.label = 1;
                    obj = myc0.k(b, gde0Var, fde0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        fde0Var = new fde0(this, continuationImpl);
        Object obj2 = fde0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fde0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.cde0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(VideoFile videoFile, ArrayList arrayList, ContinuationImpl continuationImpl) {
        zde0 zde0Var;
        int i;
        if (continuationImpl instanceof zde0) {
            zde0Var = (zde0) continuationImpl;
            int i2 = zde0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zde0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = zde0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zde0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    aee0 aee0Var = new aee0(this, videoFile, arrayList, null);
                    zde0Var.L$0 = null;
                    zde0Var.L$1 = null;
                    zde0Var.label = 1;
                    obj = myc0.k(b, aee0Var, zde0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        zde0Var = new zde0(this, continuationImpl);
        Object obj2 = zde0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zde0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.cde0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(VideoFile videoFile, ArrayList arrayList, ContinuationImpl continuationImpl) {
        dde0 dde0Var;
        int i;
        if (continuationImpl instanceof dde0) {
            dde0Var = (dde0) continuationImpl;
            int i2 = dde0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dde0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = dde0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dde0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    ede0 ede0Var = new ede0(this, videoFile, arrayList, null);
                    dde0Var.L$0 = null;
                    dde0Var.L$1 = null;
                    dde0Var.label = 1;
                    obj = myc0.k(b, ede0Var, dde0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        dde0Var = new dde0(this, continuationImpl);
        Object obj2 = dde0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dde0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
