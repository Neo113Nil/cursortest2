package xsna;

import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* compiled from: CommunitySettingsActionsModalBottomSheet.kt */
/* loaded from: classes5.dex */
public final class z1i {
    public final ExtendedCommunityProfile a;
    public final o1i b;
    public final a2i c;
    public dw20 d;

    public z1i(ExtendedCommunityProfile extendedCommunityProfile, o1i o1iVar, a2i a2iVar) {
        this.a = extendedCommunityProfile;
        this.b = o1iVar;
        this.c = a2iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cf, code lost:
    
        if (r1.a(r7, r4) != r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d1, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r1.a(r0, r4) == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(z1i z1iVar, ali0 ali0Var, BaseContinuationImpl baseContinuationImpl) {
        v1i v1iVar;
        int i;
        ali0 ali0Var2 = ali0Var;
        ExtendedCommunityProfile extendedCommunityProfile = z1iVar.a;
        if (baseContinuationImpl instanceof v1i) {
            v1iVar = (v1i) baseContinuationImpl;
            int i2 = v1iVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v1iVar.label = i2 - Integer.MIN_VALUE;
                Object obj = v1iVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = v1iVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (extendedCommunityProfile.e0) {
                        if (w2h.b(extendedCommunityProfile)) {
                            e520 e520Var = b2i.l;
                            v1iVar.L$0 = ali0Var2;
                            v1iVar.label = 1;
                        }
                        if (!extendedCommunityProfile.c2) {
                        }
                        e520 e520Var2 = b2i.a;
                        e520 e520Var3 = new e520(R.id.vk_community_allow_messages, ((Number) r0.j()).intValue(), ((Number) r0.i()).intValue(), 1, false, 0, 0, false, null, 0, null, false, 8176);
                        v1iVar.L$0 = null;
                        v1iVar.L$1 = null;
                        v1iVar.I$0 = 0;
                        v1iVar.label = 2;
                    }
                    return s3q0.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                ali0Var2 = (ali0) v1iVar.L$0;
                kotlin.a.a(obj);
                Pair pair = !extendedCommunityProfile.c2 ? new Pair(new Integer(R.string.deny_messages), new Integer(R.drawable.vk_icon_message_cross_outline_28)) : new Pair(new Integer(R.string.allow_messages), new Integer(R.drawable.vk_icon_message_check_outline_28));
                e520 e520Var22 = b2i.a;
                e520 e520Var32 = new e520(R.id.vk_community_allow_messages, ((Number) pair.j()).intValue(), ((Number) pair.i()).intValue(), 1, false, 0, 0, false, null, 0, null, false, 8176);
                v1iVar.L$0 = null;
                v1iVar.L$1 = null;
                v1iVar.I$0 = 0;
                v1iVar.label = 2;
            }
        }
        v1iVar = new v1i(z1iVar, baseContinuationImpl);
        Object obj2 = v1iVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = v1iVar.label;
        if (i != 0) {
        }
    }
}
