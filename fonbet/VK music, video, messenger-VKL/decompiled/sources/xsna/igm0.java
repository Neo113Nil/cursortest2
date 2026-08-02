package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.stories.model.StoryEntry;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.nfm0;

/* compiled from: StoryStatisticsReducer.kt */
/* loaded from: classes6.dex */
public final class igm0 extends dm50<khm0, nfm0, chm0> {

    /* compiled from: StoryStatisticsReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryPrivacyType.values().length];
            try {
                iArr[StoryPrivacyType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryPrivacyType.FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryPrivacyType.BEST_FRIENDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoryPrivacyType.ONLY_ME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoryPrivacyType.FRIENDS_OF_FRIENDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoryPrivacyType.SOME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoryPrivacyType.EXCLUDED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.dm50
    public final chm0 c(chm0 chm0Var, nfm0 nfm0Var) {
        Object obj;
        chm0 chm0Var2 = chm0Var;
        nfm0 nfm0Var2 = nfm0Var;
        if (nfm0Var2 instanceof nfm0.e) {
            return chm0.a(chm0Var2, ((nfm0.e) nfm0Var2).b, false, 0, null, null, null, 0, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        }
        if (nfm0Var2 instanceof nfm0.b) {
            Set R0 = j5g.R0(chm0Var2.h);
            R0.add(Integer.valueOf(((nfm0.b) nfm0Var2).b));
            s3q0 s3q0Var = s3q0.a;
            return chm0.a(chm0Var2, false, false, 0, null, R0, null, 0, 959);
        }
        if (nfm0Var2 instanceof nfm0.d) {
            return chm0.a(chm0Var2, false, ((nfm0.d) nfm0Var2).b, 0, null, null, null, 0, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT);
        }
        if (!(nfm0Var2 instanceof nfm0.a)) {
            if (nfm0Var2 instanceof nfm0.g) {
                return chm0.a(chm0Var2, false, false, 0, null, null, ((nfm0.g) nfm0Var2).b, 0, 895);
            }
            if (nfm0Var2 instanceof nfm0.c) {
                return chm0.a(chm0Var2, false, false, 0, null, null, null, ((nfm0.c) nfm0Var2).b, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            }
            if (!(nfm0Var2 instanceof nfm0.f)) {
                throw new NoWhenBranchMatchedException();
            }
            nfm0.f fVar = (nfm0.f) nfm0Var2;
            return chm0.a(chm0Var2, false, false, 0, pn00.o(chm0Var2.f, new Pair(Integer.valueOf(fVar.b), Integer.valueOf(fVar.c))), null, null, 0, 1007);
        }
        int i = ((nfm0.a) nfm0Var2).b;
        List<StoryEntry> list = chm0Var2.e;
        boolean z = chm0Var2.j;
        Iterator<E> it = StoryPrivacyType.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String j = ((StoryPrivacyType) obj).j();
            StoryEntry storyEntry = (StoryEntry) j5g.b0(i, list);
            if (epx.f(j, storyEntry != null ? storyEntry.x0 : null)) {
                break;
            }
        }
        return chm0.a(chm0Var2, false, false, i, null, null, (StoryPrivacyType) (z ? null : obj), 0, 891);
    }

    @Override // xsna.dm50
    public final khm0 d() {
        return new khm0(e(new xc50(this, 24)), e(new qjl0(this, 3)));
    }

    @Override // xsna.dm50
    public final void h(chm0 chm0Var, khm0 khm0Var) {
        chm0 chm0Var2 = chm0Var;
        khm0 khm0Var2 = khm0Var;
        f(khm0Var2.a, chm0Var2);
        f(khm0Var2.b, chm0Var2);
    }
}
