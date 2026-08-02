package xsna;

import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: CommunityProfileLoadFeatureDelegate.kt */
@b6l(c = "com.vk.profile.community.impl.ui.profile.featuredelegates.CommunityProfileLoadFeatureDelegate$createAdditionalFields$fields$1", f = "CommunityProfileLoadFeatureDelegate.kt", l = {265, 286, MBSupportMuteAdType.INTERSTITIAL_VIDEO}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class crh extends RestrictedSuspendLambda implements wzs<ali0<? super GroupsFieldsDto>, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public crh() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        crh crhVar = new crh(2, spjVar);
        crhVar.L$0 = obj;
        return crhVar;
    }

    @Override // xsna.wzs
    public final Object invoke(ali0<? super GroupsFieldsDto> ali0Var, spj<? super s3q0> spjVar) {
        return ((crh) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
    
        if (r1.a(r3, r23) == r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0085, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if (r1.a(r3, r23) == r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r3 == r2) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ali0 ali0Var = (ali0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            uki0 D = rl3.D(new GroupsFieldsDto[]{GroupsFieldsDto.IS_BUSINESS_CATEGORY, GroupsFieldsDto.RATING, GroupsFieldsDto.IS_MEMBER, GroupsFieldsDto.PHOTO_AVG_COLOR, GroupsFieldsDto.NAME_HISTORY, GroupsFieldsDto.LEAVE_MODE, GroupsFieldsDto.HAS_LIVE_COVER, GroupsFieldsDto.AGE_MARK, GroupsFieldsDto.IS_MARKET_ONLINE_BOOKING_ACTION_BUTTON_ENABLED, GroupsFieldsDto.STRIKES_RESTRICTIONS, GroupsFieldsDto.STRIKES_INFO, GroupsFieldsDto.RECOMMENDED_TIPS_WIDGET, GroupsFieldsDto.BANNER_ADS_MAIN_CLIENT, GroupsFieldsDto.URL, GroupsFieldsDto.ENABLED_FEATURES, GroupsFieldsDto.TRUST_MARK});
            this.L$0 = ali0Var;
            this.label = 1;
            ali0Var.getClass();
            Object b = ali0Var.b(D.iterator(), this);
            if (b != coroutineSingletons) {
                b = s3q0.a;
            }
        } else if (i == 1) {
            kotlin.a.a(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
            GroupsFieldsDto groupsFieldsDto = GroupsFieldsDto.YCLIENTS_REPEAT_RECORDS;
            this.L$0 = null;
            this.label = 3;
        }
        GroupsFieldsDto groupsFieldsDto2 = GroupsFieldsDto.PHOTO_BASE;
        this.L$0 = ali0Var;
        this.label = 2;
    }
}
