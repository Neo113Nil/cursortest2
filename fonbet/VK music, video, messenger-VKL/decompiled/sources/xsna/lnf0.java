package xsna;

import com.vk.reefton.dto.ReefVideoPlayerState;
import com.vk.reefton.literx.observable.LambdaObserver;
import com.vk.reefton.literx.observable.ObservableFilter;
import com.vk.reefton.literx.observable.ObservableObserveOn;
import com.vk.reefton.literx.observable.ObservableSubscribeOn;
import com.vk.reefton.literx.sbjects.PublishSubject;
import xsna.snf0;

/* compiled from: ReefExoPlayerInterceptor.kt */
/* loaded from: classes5.dex */
public final class lnf0 implements snf0 {
    public final b8h0 a;
    public LambdaObserver b;

    /* compiled from: ReefExoPlayerInterceptor.kt */
    public static final class a implements snf0.a {
        @Override // xsna.snf0.a
        public final snf0 a(qof0 qof0Var) {
            return new lnf0(qof0Var.e());
        }
    }

    /* compiled from: ReefExoPlayerInterceptor.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReefVideoPlayerState.values().length];
            try {
                iArr[ReefVideoPlayerState.STATE_IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReefVideoPlayerState.STATE_BUFFERING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReefVideoPlayerState.STATE_READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReefVideoPlayerState.STATE_ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public lnf0(b8h0 b8h0Var) {
        this.a = b8h0Var;
        ReefVideoPlayerState reefVideoPlayerState = ReefVideoPlayerState.STATE_IDLE;
    }

    @Override // xsna.snf0
    public final void a(PublishSubject publishSubject, PublishSubject publishSubject2) {
        LambdaObserver lambdaObserver = this.b;
        if (lambdaObserver != null) {
            lambdaObserver.dispose();
        }
        b8h0 b8h0Var = this.a;
        this.b = new ObservableFilter(new ObservableSubscribeOn(new ObservableObserveOn(publishSubject, b8h0Var), b8h0Var), mnf0.c).b(new pey(this, publishSubject2));
    }

    @Override // xsna.snf0
    public final void release() {
        LambdaObserver lambdaObserver = this.b;
        if (lambdaObserver != null) {
            lambdaObserver.dispose();
        }
        ReefVideoPlayerState reefVideoPlayerState = ReefVideoPlayerState.STATE_IDLE;
    }
}
