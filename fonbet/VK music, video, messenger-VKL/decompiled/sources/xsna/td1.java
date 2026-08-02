package xsna;

import android.content.Context;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.AlbumChooseState;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.VideoAlbumData;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseArguments;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseResult;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.VideoAlbumResultData;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cd1;
import xsna.el50;
import xsna.id1;
import xsna.ln50;

/* compiled from: AlbumChooseInlineActor.kt */
/* loaded from: classes7.dex */
public final class td1 extends bl50<AlbumChooseState, cd1, on50, bwj, dwj, id1> {
    public static final VideoAlbumData h;
    public static final VideoAlbumData i;
    public final AlbumChooseArguments c;
    public final boolean d;
    public final cn1 e;
    public final fks0 f;
    public final sj50<AlbumChooseState, on50, ll50<on50, bwj, dwj>, jl50<AlbumChooseState>, id1> g;

    /* compiled from: AlbumChooseInlineActor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlbumChooseArguments.EntryPoint.values().length];
            try {
                iArr[AlbumChooseArguments.EntryPoint.VIDEO_UPLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlbumChooseArguments.EntryPoint.VIDEO_EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AlbumChooseInlineActor.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.store.AlbumChooseInlineActor$tryLoadData$1$1", f = "AlbumChooseInlineActor.kt", l = {Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $shouldReload;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$shouldReload = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return td1.this.new b(this.$shouldReload, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:62:0x006e, code lost:
        
            if (r7 == r1) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00b4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            Object m;
            UserId q;
            Object obj2;
            td1 td1Var;
            boolean z;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            boolean z2 = false;
            int i3 = 1;
            PrivacySetting.PrivacyRule privacyRule = null;
            if (i2 == 0) {
                kotlin.a.a(obj);
                rdi.y(td1.this, new qm(i3));
                i = this.$shouldReload ? 0 : ((AlbumChooseState) td1.this.b.getCurrentState()).d;
                td1 td1Var2 = td1.this;
                this.I$0 = i;
                this.label = 1;
                m = td1.m(td1Var2, this);
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = this.Z$0;
                    i = this.I$0;
                    td1Var = (td1) this.L$1;
                    m = this.L$0;
                    kotlin.a.a(obj);
                    obj2 = ((Result) obj).d();
                    if (!(obj2 instanceof Result.Failure)) {
                        List<VideoAlbum> list = (List) obj2;
                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        for (VideoAlbum videoAlbum : list) {
                            VideoAlbumData videoAlbumData = td1.h;
                            td1Var.getClass();
                            List<? extends PrivacySetting.PrivacyRule> list2 = videoAlbum.j;
                            PrivacySetting.PrivacyRule privacyRule2 = list2 != null ? (PrivacySetting.PrivacyRule) j5g.a0(list2) : privacyRule;
                            boolean z3 = (privacyRule2 == null || Collections.singletonList(PrivacyRules.a.d).equals(privacyRule2.zb())) ? true : z2;
                            int i4 = videoAlbum.b;
                            String str = videoAlbum.d;
                            if (str == null) {
                                str = "";
                            }
                            boolean z4 = !z3;
                            List<Integer> list3 = ((AlbumChooseState) td1Var.b.getCurrentState()).c;
                            arrayList.add(new VideoAlbumData(i4, str, z4, true, list3 != null ? list3.contains(Integer.valueOf(videoAlbum.b)) : z2, videoAlbum.h.b, videoAlbum.g, videoAlbum.f, videoAlbum.j));
                            z2 = false;
                            privacyRule = null;
                        }
                        rdi.y(td1Var, new com.vk.music.podcast.impl.ui.episode.a(z, td1Var, arrayList, i));
                    }
                    if (Result.a(obj2) != null) {
                        rdi.y(td1Var, new sm(i3));
                    }
                    td1 td1Var3 = td1.this;
                    if (Result.a(m) != null) {
                        rdi.y(td1Var3, new vd1(0));
                    }
                    return s3q0.a;
                }
                i = this.I$0;
                kotlin.a.a(obj);
                m = ((Result) obj).d();
            }
            td1 td1Var4 = td1.this;
            boolean z5 = this.$shouldReload;
            if (!(m instanceof Result.Failure)) {
                AlbumChooseArguments albumChooseArguments = td1Var4.c;
                AlbumChooseArguments.NoInitialAlbums noInitialAlbums = albumChooseArguments instanceof AlbumChooseArguments.NoInitialAlbums ? (AlbumChooseArguments.NoInitialAlbums) albumChooseArguments : null;
                if (noInitialAlbums == null || (q = noInitialAlbums.e) == null) {
                    q = albumChooseArguments.q();
                }
                cn1 cn1Var = td1Var4.e;
                this.L$0 = m;
                this.L$1 = td1Var4;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i;
                this.Z$0 = z5;
                this.I$1 = 0;
                this.label = 2;
                Object b = cn1Var.b(q, i, 20, this);
                if (b != coroutineSingletons) {
                    obj2 = b;
                    td1Var = td1Var4;
                    z = z5;
                    if (!(obj2 instanceof Result.Failure)) {
                    }
                    if (Result.a(obj2) != null) {
                    }
                }
                return coroutineSingletons;
            }
            td1 td1Var32 = td1.this;
            if (Result.a(m) != null) {
            }
            return s3q0.a;
        }
    }

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        h = new VideoAlbumData(-1, context.getString(R.string.video_publish_album_uploaded), false, false, true, new ArrayList(), 0, 0, null);
        Context context2 = e43.a;
        i = new VideoAlbumData(-2, (context2 != null ? context2 : null).getString(R.string.video_publish_album_added), false, false, true, new ArrayList(), 0, 0, null);
    }

    public td1(AlbumChooseArguments albumChooseArguments, boolean z, cn1 cn1Var, fks0 fks0Var, sj50<AlbumChooseState, on50, ll50<on50, bwj, dwj>, jl50<AlbumChooseState>, id1> sj50Var) {
        super(sj50Var);
        this.c = albumChooseArguments;
        this.d = z;
        this.e = cn1Var;
        this.f = fks0Var;
        this.g = sj50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(td1 td1Var, ContinuationImpl continuationImpl) {
        ud1 ud1Var;
        int i2;
        Object f;
        AlbumChooseArguments albumChooseArguments = td1Var.c;
        if (continuationImpl instanceof ud1) {
            ud1Var = (ud1) continuationImpl;
            int i3 = ud1Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ud1Var.label = i3 - Integer.MIN_VALUE;
                Object obj = ud1Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = ud1Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    List<Integer> list = ((AlbumChooseState) td1Var.b.getCurrentState()).c;
                    Result result = list != null ? new Result(list) : null;
                    if (result != null) {
                        return result.d();
                    }
                    if (albumChooseArguments instanceof AlbumChooseArguments.WithInitialAlbums) {
                        f = ((AlbumChooseArguments.WithInitialAlbums) albumChooseArguments).d;
                        if (!(f instanceof Result.Failure)) {
                            rdi.y(td1Var, new tb((List) f, 5));
                        }
                        return f;
                    }
                    if (!(albumChooseArguments instanceof AlbumChooseArguments.NoInitialAlbums)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cn1 cn1Var = td1Var.e;
                    VideoFileOld videoFileOld = new VideoFileOld();
                    AlbumChooseArguments.NoInitialAlbums noInitialAlbums = (AlbumChooseArguments.NoInitialAlbums) albumChooseArguments;
                    videoFileOld.c = noInitialAlbums.d;
                    videoFileOld.b = noInitialAlbums.f;
                    UserId userId = noInitialAlbums.e;
                    ud1Var.L$0 = null;
                    ud1Var.label = 1;
                    f = cn1Var.f(videoFileOld, userId, ud1Var);
                    if (f == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    f = ((Result) obj).d();
                }
                if (!(f instanceof Result.Failure)) {
                    List list2 = (List) f;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Integer(((VideoAlbumResultData) it.next()).b));
                    }
                    f = arrayList;
                }
                if (!(f instanceof Result.Failure)) {
                }
                return f;
            }
        }
        ud1Var = new ud1(td1Var, continuationImpl);
        Object obj2 = ud1Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = ud1Var.label;
        if (i2 != 0) {
        }
        if (!(f instanceof Result.Failure)) {
        }
        if (!(f instanceof Result.Failure)) {
        }
        return f;
    }

    public static final AlbumChooseResult q(td1 td1Var, AlbumChooseState albumChooseState) {
        td1Var.getClass();
        List<VideoAlbumData> list = albumChooseState.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((VideoAlbumData) obj).f) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            VideoAlbumData videoAlbumData = (VideoAlbumData) it.next();
            arrayList2.add(new VideoAlbumResultData(videoAlbumData.b, videoAlbumData.c));
        }
        return new AlbumChooseResult(arrayList2);
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<AlbumChooseState, on50, ll50<on50, bwj, dwj>, jl50<AlbumChooseState>, id1> W() {
        return this.g;
    }

    @Override // xsna.bl50, xsna.qj50
    public final void init() {
        r(true);
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        String str;
        cd1 cd1Var = (cd1) lj50Var;
        boolean z = cd1Var instanceof cd1.h;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        if (z) {
            if (((AlbumChooseState) sj50Var.getCurrentState()).g) {
                rdi.y(this, new com.vk.movika.sdk.base.observable.s(1));
                r(true);
                return;
            }
            return;
        }
        if ((cd1Var instanceof cd1.d) || (cd1Var instanceof cd1.c)) {
            c(new id1.a(null));
            return;
        }
        boolean equals = cd1Var.equals(cd1.a.b);
        AlbumChooseArguments albumChooseArguments = this.c;
        if (equals) {
            rdi.y(this, new p60(1));
            UserId q = albumChooseArguments.q();
            int i2 = a.$EnumSwitchMapping$0[albumChooseArguments.d().ordinal()];
            if (i2 == 1) {
                str = "NEW_VIDEO";
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "EDIT_VIDEO";
            }
            c(new id1.b(q, str));
            return;
        }
        if (cd1Var instanceof cd1.b) {
            Object obj = ((cd1.b) cd1Var).b.e;
            VideoAlbumData videoAlbumData = obj instanceof VideoAlbumData ? (VideoAlbumData) obj : null;
            if (videoAlbumData == null) {
                return;
            }
            rdi.y(this, new qd1(this, videoAlbumData, VideoAlbumData.a(videoAlbumData, !videoAlbumData.f)));
            return;
        }
        if (cd1Var.equals(cd1.g.b)) {
            AlbumChooseArguments.NoInitialAlbums noInitialAlbums = albumChooseArguments instanceof AlbumChooseArguments.NoInitialAlbums ? (AlbumChooseArguments.NoInitialAlbums) albumChooseArguments : null;
            il50.a(this, new td0(1, noInitialAlbums != null ? Integer.valueOf(noInitialAlbums.d) : null, this));
        } else {
            if (cd1Var.equals(cd1.f.b)) {
                r(false);
                return;
            }
            if (!cd1Var.equals(cd1.e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((AlbumChooseState) sj50Var.getCurrentState()).g || this.f.i1()) {
                rdi.y(this, new rd1(0));
                r(true);
            }
        }
    }

    public final void r(boolean z) {
        if (z) {
            g(new in50(fpf0.a(cd1.f.class)));
        }
        el50.a.a(this, new in50(fpf0.a(cd1.f.class)), ln50.a.b, new sd1(this, z, 0));
    }
}
