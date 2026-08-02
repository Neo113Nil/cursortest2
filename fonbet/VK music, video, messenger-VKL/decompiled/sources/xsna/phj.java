package xsna;

import android.content.res.Configuration;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.o2d0;

/* compiled from: Content.kt */
@b6l(c = "com.vk.clips.playlists.playlist_ui.ui.ContentKt$ClipsPlaylistUiItem$1$1", f = "Content.kt", l = {241, 246, 248, 249}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class phj extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Configuration $configuration;
    final /* synthetic */ azl $density;
    final /* synthetic */ sg50 $interactionSource;
    final /* synthetic */ boolean $isPreselected;
    float F$0;
    float F$1;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phj(boolean z, azl azlVar, Configuration configuration, sg50 sg50Var, spj<? super phj> spjVar) {
        super(2, spjVar);
        this.$isPreselected = z;
        this.$density = azlVar;
        this.$configuration = configuration;
        this.$interactionSource = sg50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new phj(this.$isPreselected, this.$density, this.$configuration, this.$interactionSource, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((phj) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0111, code lost:
    
        if (r8.a(r6, r18) != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Configuration configuration;
        sg50 sg50Var;
        azl azlVar;
        int i;
        o2d0.b bVar;
        int i2;
        float f;
        float f2;
        sg50 sg50Var2;
        o2d0.b bVar2;
        float f3;
        int i3;
        sg50 sg50Var3;
        o2d0.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        if (i4 == 0) {
            kotlin.a.a(obj);
            if (this.$isPreselected) {
                azl azlVar2 = this.$density;
                configuration = this.$configuration;
                sg50Var = this.$interactionSource;
                this.L$0 = configuration;
                this.L$1 = sg50Var;
                this.L$2 = azlVar2;
                this.I$0 = 0;
                this.label = 1;
                if (qsl.b(5L, this) != coroutineSingletons) {
                    azlVar = azlVar2;
                    i = 0;
                    float f4 = 2;
                    float f5 = configuration.screenWidthDp / f4;
                    float f6 = 64 / f4;
                    float I0 = azlVar.I0(f5);
                    float I02 = azlVar.I0(f6);
                    bVar = new o2d0.b((Float.floatToRawIntBits(I0) << 32) | (Float.floatToRawIntBits(I02) & 4294967295L));
                    this.L$0 = sg50Var;
                    this.L$1 = null;
                    this.L$2 = bVar;
                    this.I$0 = i;
                    this.F$0 = f6;
                    this.F$1 = f5;
                    this.label = 2;
                    if (sg50Var.a(bVar, this) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        } else {
            if (i4 == 1) {
                i = this.I$0;
                azlVar = (azl) this.L$2;
                sg50Var = (sg50) this.L$1;
                configuration = (Configuration) this.L$0;
                kotlin.a.a(obj);
                float f42 = 2;
                float f52 = configuration.screenWidthDp / f42;
                float f62 = 64 / f42;
                float I03 = azlVar.I0(f52);
                float I022 = azlVar.I0(f62);
                bVar = new o2d0.b((Float.floatToRawIntBits(I03) << 32) | (Float.floatToRawIntBits(I022) & 4294967295L));
                this.L$0 = sg50Var;
                this.L$1 = null;
                this.L$2 = bVar;
                this.I$0 = i;
                this.F$0 = f62;
                this.F$1 = f52;
                this.label = 2;
                if (sg50Var.a(bVar, this) != coroutineSingletons) {
                    i2 = i;
                    f = f52;
                    f2 = f62;
                    sg50Var2 = sg50Var;
                    bVar2 = bVar;
                    o2d0.c cVar2 = new o2d0.c(bVar2);
                    this.L$0 = sg50Var2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = cVar2;
                    this.I$0 = i2;
                    this.F$0 = f2;
                    this.F$1 = f;
                    this.label = 3;
                    if (qsl.b(3000L, this) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i4 == 2) {
                f = this.F$1;
                f2 = this.F$0;
                i2 = this.I$0;
                bVar2 = (o2d0.b) this.L$2;
                sg50Var2 = (sg50) this.L$0;
                kotlin.a.a(obj);
                o2d0.c cVar22 = new o2d0.c(bVar2);
                this.L$0 = sg50Var2;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = cVar22;
                this.I$0 = i2;
                this.F$0 = f2;
                this.F$1 = f;
                this.label = 3;
                if (qsl.b(3000L, this) != coroutineSingletons) {
                    f3 = f2;
                    i3 = i2;
                    sg50Var3 = sg50Var2;
                    cVar = cVar22;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.I$0 = i3;
                    this.F$0 = f3;
                    this.F$1 = f;
                    this.label = 4;
                }
                return coroutineSingletons;
            }
            if (i4 == 3) {
                f = this.F$1;
                f3 = this.F$0;
                i3 = this.I$0;
                cVar = (o2d0.c) this.L$3;
                sg50Var3 = (sg50) this.L$0;
                kotlin.a.a(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i3;
                this.F$0 = f3;
                this.F$1 = f;
                this.label = 4;
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
        }
        return s3q0.a;
    }
}
