package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.x9m0;

/* compiled from: StoryPrivacyReducer.kt */
/* loaded from: classes16.dex */
public final class y9m0 extends dm50<lam0, x9m0, fam0> {
    public final gpj0 d;

    /* compiled from: StoryPrivacyReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryPrivacyType.values().length];
            try {
                iArr[StoryPrivacyType.ONLY_ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryPrivacyType.FRIENDS_OF_FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryPrivacyType.SOME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public y9m0(gpj0 gpj0Var, fam0 fam0Var) {
        super(fam0Var);
        this.d = gpj0Var;
    }

    @Override // xsna.dm50
    public final fam0 c(fam0 fam0Var, x9m0 x9m0Var) {
        fam0 fam0Var2 = fam0Var;
        x9m0 x9m0Var2 = x9m0Var;
        if (x9m0Var2.equals(x9m0.d.b)) {
            return fam0Var2;
        }
        if (x9m0Var2 instanceof x9m0.g) {
            return fam0.a(fam0Var2, null, null, ((x9m0.g) x9m0Var2).b, null, null, null, 247);
        }
        if (x9m0Var2 instanceof x9m0.f) {
            return fam0.a(fam0Var2, null, ((x9m0.f) x9m0Var2).b, null, null, null, null, 251);
        }
        if (x9m0Var2 instanceof x9m0.h) {
            return fam0.a(fam0Var2, ((x9m0.h) x9m0Var2).b, null, null, null, null, null, 254);
        }
        if (x9m0Var2 instanceof x9m0.e) {
            return fam0.a(fam0Var2, null, null, null, null, null, null, 253);
        }
        if (x9m0Var2 instanceof x9m0.a) {
            return fam0.a(fam0Var2, null, null, null, ((x9m0.a) x9m0Var2).b, null, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
        }
        if (x9m0Var2 instanceof x9m0.b) {
            return fam0.a(fam0Var2, null, null, null, null, ((x9m0.b) x9m0Var2).b, null, 191);
        }
        if (x9m0Var2 instanceof x9m0.c) {
            return fam0.a(fam0Var2, null, null, null, null, null, ((x9m0.c) x9m0Var2).b, 127);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final lam0 d() {
        return new lam0(e(new yyl0(this, 2)));
    }

    @Override // xsna.dm50
    public final void h(fam0 fam0Var, lam0 lam0Var) {
        f(lam0Var.a, fam0Var);
    }
}
