package xsna;

import com.vk.clips.sdk.drafts.api.ClipsDraftComponent;
import com.vk.clips.sdk.drafts.api.ClipsDraftDirType;
import com.vk.clips.sdk.drafts.models.ClipsDraftAudioEffectType;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsEditorDraftControllerImpl.kt */
/* loaded from: classes16.dex */
public final class mxd implements txd {
    public final ClipsDraftComponent b;
    public final e9e c;
    public final g2f d;
    public final f8h0 e;
    public final hpj f;

    /* compiled from: ClipsEditorDraftControllerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsDraftDirType.values().length];
            try {
                iArr[ClipsDraftDirType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsDraftDirType.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsDraftDirType.AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ClipsEditorDraftControllerImpl.kt */
    @b6l(c = "com.vk.clips.editor.draft.ClipsEditorDraftControllerImpl$onStateChanged$1", f = "ClipsEditorDraftControllerImpl.kt", l = {102}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ pdo $newState;
        final /* synthetic */ pdo $oldState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pdo pdoVar, pdo pdoVar2, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$oldState = pdoVar;
            this.$newState = pdoVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return mxd.this.new b(this.$oldState, this.$newState, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                mxd mxdVar = mxd.this;
                pdo pdoVar = this.$oldState;
                pdo pdoVar2 = this.$newState;
                mxdVar.getClass();
                if (!pdoVar.c.equals(pdoVar2.c) || !pdoVar.d.equals(pdoVar2.d) || pdoVar.g != pdoVar2.g) {
                    mxd mxdVar2 = mxd.this;
                    pdo pdoVar3 = this.$newState;
                    this.label = 1;
                    if (mxdVar2.c(pdoVar3, false, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: ClipsEditorDraftControllerImpl.kt */
    @b6l(c = "com.vk.clips.editor.draft.ClipsEditorDraftControllerImpl$syncToActiveDraft$1", f = "ClipsEditorDraftControllerImpl.kt", l = {152, 153}, m = "invokeSuspend")
    public final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $isNeedToArchive;
        final /* synthetic */ gzs<s3q0> $onSuccess;
        final /* synthetic */ pdo $state;
        int label;

        /* compiled from: ClipsEditorDraftControllerImpl.kt */
        @b6l(c = "com.vk.clips.editor.draft.ClipsEditorDraftControllerImpl$syncToActiveDraft$1$1", f = "ClipsEditorDraftControllerImpl.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ gzs<s3q0> $onSuccess;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(gzs<s3q0> gzsVar, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$onSuccess = gzsVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new a(this.$onSuccess, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                this.$onSuccess.invoke();
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(pdo pdoVar, boolean z, gzs<s3q0> gzsVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$state = pdoVar;
            this.$isNeedToArchive = z;
            this.$onSuccess = gzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return mxd.this.new c(this.$state, this.$isNeedToArchive, this.$onSuccess, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            if (xsna.myc0.k(r6, r1, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        
            if (r6.c(r1, r4, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                mxd mxdVar = mxd.this;
                pdo pdoVar = this.$state;
                boolean z = this.$isNeedToArchive;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
            f8h0 f8h0Var = mxd.this.e;
            a aVar = new a(this.$onSuccess, null);
            this.label = 2;
        }
    }

    public mxd(ClipsDraftComponent clipsDraftComponent, e9e e9eVar, g2f g2fVar) {
        this.b = clipsDraftComponent;
        this.c = e9eVar;
        this.d = g2fVar;
        f8h0 m = edi.m(g2fVar.b());
        this.e = edi.m(g2fVar.d());
        this.f = zvj.a(m);
    }

    @Override // xsna.txd
    public final void a(pdo pdoVar, gzs<s3q0> gzsVar) {
        myc0.h(this.f, null, null, new c(pdoVar, false, gzsVar, null), 3);
    }

    @Override // xsna.txd
    public final void b(pdo pdoVar, pdo pdoVar2, boolean z) {
        myc0.h(this.f, null, null, new b(pdoVar, pdoVar2, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x02dd, code lost:
    
        if (r1.k8(r5, r2) == r3) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0091, code lost:
    
        if (r6 == r3) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x02ef, code lost:
    
        if (r1.Xa(r4, r2) == r3) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x015b -> B:26:0x015c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(pdo pdoVar, boolean z, ContinuationImpl continuationImpl) {
        nxd nxdVar;
        int i;
        pdo pdoVar2;
        boolean z2;
        Object rd;
        otd otdVar;
        List<cud> list;
        Iterator it;
        Collection collection;
        pdo pdoVar3;
        otd otdVar2;
        Object obj;
        ClipsDraftComponent clipsDraftComponent;
        File c2;
        Object obj2;
        mxd mxdVar = this;
        if (continuationImpl instanceof nxd) {
            nxdVar = (nxd) continuationImpl;
            int i2 = nxdVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nxdVar.label = i2 - Integer.MIN_VALUE;
                Object obj3 = nxdVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nxdVar.label;
                ClipsDraftComponent clipsDraftComponent2 = mxdVar.b;
                if (i != 0) {
                    kotlin.a.a(obj3);
                    pdoVar2 = pdoVar;
                    nxdVar.L$0 = pdoVar2;
                    z2 = z;
                    nxdVar.Z$0 = z2;
                    nxdVar.label = 1;
                    rd = clipsDraftComponent2.rd(nxdVar);
                } else if (i == 1) {
                    z2 = nxdVar.Z$0;
                    pdo pdoVar4 = (pdo) nxdVar.L$0;
                    kotlin.a.a(obj3);
                    rd = obj3;
                    pdoVar2 = pdoVar4;
                } else {
                    if (i == 2) {
                        z2 = nxdVar.Z$0;
                        collection = (Collection) nxdVar.L$6;
                        ClipsEditorInputVideoItem clipsEditorInputVideoItem = (ClipsEditorInputVideoItem) nxdVar.L$5;
                        it = (Iterator) nxdVar.L$4;
                        Collection collection2 = (Collection) nxdVar.L$3;
                        list = (List) nxdVar.L$2;
                        otdVar = (otd) nxdVar.L$1;
                        pdoVar3 = (pdo) nxdVar.L$0;
                        kotlin.a.a(obj3);
                        File file = (File) obj3;
                        cud b2 = bud.b(clipsEditorInputVideoItem);
                        collection.add(new cud(file, b2.b, b2.c, b2.d, b2.e, b2.f, b2.g, b2.h, b2.i, b2.j, b2.k, b2.l, b2.m, b2.n, b2.o, b2.p));
                        mxdVar = this;
                        clipsDraftComponent2 = clipsDraftComponent2;
                        collection = collection2;
                        if (it.hasNext()) {
                            clipsEditorInputVideoItem = (ClipsEditorInputVideoItem) it.next();
                            File file2 = clipsEditorInputVideoItem.b;
                            ClipsDraftDirType clipsDraftDirType = ClipsDraftDirType.VIDEO;
                            osd a2 = mxdVar.b.getProvider().a();
                            int i3 = a.$EnumSwitchMapping$0[clipsDraftDirType.ordinal()];
                            if (i3 == 1) {
                                c2 = a2.c();
                            } else if (i3 == 2) {
                                c2 = a2.b();
                            } else {
                                if (i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c2 = a2.a();
                            }
                            if (brm0.B(file2.getAbsolutePath(), c2.getAbsolutePath(), false)) {
                                file = file2;
                                collection2 = collection;
                            } else {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it2.next();
                                    cud cudVar = (cud) obj2;
                                    if (cudVar.a.exists()) {
                                        cbr cbrVar = cbr.a;
                                        File file3 = cudVar.a;
                                        cbrVar.getClass();
                                        if (cbr.a(file3, file2)) {
                                            break;
                                        }
                                    }
                                }
                                cud cudVar2 = (cud) obj2;
                                File file4 = cudVar2 != null ? cudVar2.a : null;
                                if (file4 == null) {
                                    ClipsDraftDirType clipsDraftDirType2 = ClipsDraftDirType.VIDEO;
                                    nxdVar.L$0 = pdoVar3;
                                    nxdVar.L$1 = otdVar;
                                    nxdVar.L$2 = list;
                                    nxdVar.L$3 = collection;
                                    nxdVar.L$4 = it;
                                    nxdVar.L$5 = clipsEditorInputVideoItem;
                                    nxdVar.L$6 = collection;
                                    nxdVar.Z$0 = z2;
                                    nxdVar.label = 2;
                                    obj3 = clipsDraftComponent2.hb(file2, clipsDraftDirType2, false);
                                    if (obj3 != coroutineSingletons) {
                                        collection2 = collection;
                                        File file5 = (File) obj3;
                                    }
                                } else {
                                    file5 = file4;
                                    collection2 = collection;
                                }
                            }
                            cud b22 = bud.b(clipsEditorInputVideoItem);
                            collection.add(new cud(file5, b22.b, b22.c, b22.d, b22.e, b22.f, b22.g, b22.h, b22.i, b22.j, b22.k, b22.l, b22.m, b22.n, b22.o, b22.p));
                            mxdVar = this;
                            clipsDraftComponent2 = clipsDraftComponent2;
                            collection = collection2;
                            if (it.hasNext()) {
                                ClipsDraftComponent clipsDraftComponent3 = clipsDraftComponent2;
                                List list2 = (List) collection;
                                ptd ptdVar = otdVar.a;
                                ArrayList arrayList = pdoVar3.c;
                                int i4 = 10;
                                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    List<yco> list3 = (List) it3.next();
                                    ArrayList arrayList3 = new ArrayList(c5g.u(list3, i4));
                                    for (yco ycoVar : list3) {
                                        arrayList3.add(new vrd(p490.B(ycoVar.a), ycoVar.b, (ClipsDraftAudioEffectType) ClipsDraftAudioEffectType.h().get(ycoVar.c.ordinal()), ycoVar.d));
                                        it3 = it3;
                                        clipsDraftComponent3 = clipsDraftComponent3;
                                    }
                                    arrayList2.add(arrayList3);
                                    i4 = 10;
                                }
                                ClipsDraftComponent clipsDraftComponent4 = clipsDraftComponent3;
                                List<cud> g = rdi.g(list2);
                                float f = pdoVar3.g;
                                int a3 = z2 ? (int) (qni0.a() / 1000) : otdVar.a.g;
                                String str = ptdVar.a;
                                int i5 = ptdVar.b;
                                if ((29627 & 4) != 0) {
                                    g = ptdVar.c;
                                }
                                List<cud> list4 = g;
                                String str2 = (29627 & 8) != 0 ? ptdVar.d : null;
                                long j = (29627 & 16) != 0 ? ptdVar.e : 0L;
                                boolean z3 = ptdVar.f;
                                if ((29627 & 64) != 0) {
                                    a3 = ptdVar.g;
                                }
                                int i6 = a3;
                                boolean z4 = (29627 & 128) != 0 ? ptdVar.h : false;
                                String str3 = (29627 & 256) != 0 ? ptdVar.i : null;
                                String str4 = ptdVar.j;
                                List list5 = arrayList2;
                                if ((29627 & 1024) != 0) {
                                    list5 = ptdVar.k;
                                }
                                List list6 = list5;
                                if ((29627 & 2048) != 0) {
                                    f = ptdVar.l;
                                }
                                otdVar2 = new otd(new ptd(str, i5, list4, str2, j, z3, i6, z4, str3, str4, list6, f, ptdVar.m, (29627 & 8192) != 0 ? ptdVar.n : null), otdVar.b);
                                nxdVar.L$0 = otdVar2;
                                obj = null;
                                nxdVar.L$1 = null;
                                nxdVar.L$2 = null;
                                nxdVar.L$3 = null;
                                nxdVar.L$4 = null;
                                nxdVar.L$5 = null;
                                nxdVar.L$6 = null;
                                nxdVar.Z$0 = z2;
                                nxdVar.label = 3;
                                clipsDraftComponent = clipsDraftComponent4;
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj3);
                        return s3q0.a;
                    }
                    z2 = nxdVar.Z$0;
                    otdVar2 = (otd) nxdVar.L$0;
                    kotlin.a.a(obj3);
                    clipsDraftComponent = clipsDraftComponent2;
                    obj = null;
                    if (!z2) {
                        return s3q0.a;
                    }
                    String str5 = otdVar2.a.a;
                    nxdVar.L$0 = obj;
                    nxdVar.label = 4;
                }
                otdVar = (otd) rd;
                if (otdVar != null) {
                    return s3q0.a;
                }
                List<cud> list7 = otdVar.a.c;
                ArrayList arrayList4 = pdoVar2.d;
                ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                list = list7;
                it = arrayList4.iterator();
                collection = arrayList5;
                pdoVar3 = pdoVar2;
                if (it.hasNext()) {
                }
                return coroutineSingletons;
            }
        }
        nxdVar = new nxd(mxdVar, continuationImpl);
        Object obj32 = nxdVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nxdVar.label;
        ClipsDraftComponent clipsDraftComponent22 = mxdVar.b;
        if (i != 0) {
        }
        otdVar = (otd) rd;
        if (otdVar != null) {
        }
    }
}
