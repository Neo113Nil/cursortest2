package xsna;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.profile.Donut;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: CommunitySettingsActionsModalBottomSheet.kt */
@b6l(c = "com.vk.profile.community.impl.ui.view.CommunitySettingsActionsModalBottomSheet$createActionList$1", f = "CommunitySettingsActionsModalBottomSheet.kt", l = {171, 175, 179, 182, 184, 186, PsExtractor.PRIVATE_STREAM_1, PsExtractor.AUDIO_STREAM, 195, 198, 203, 207, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class r1i extends RestrictedSuspendLambda implements wzs<ali0<? super e520>, spj<? super s3q0>, Object> {
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ z1i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1i(z1i z1iVar, Context context, spj<? super r1i> spjVar) {
        super(2, spjVar);
        this.this$0 = z1iVar;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        r1i r1iVar = new r1i(this.this$0, this.$context, spjVar);
        r1iVar.L$0 = obj;
        return r1iVar;
    }

    @Override // xsna.wzs
    public final Object invoke(ali0<? super e520> ali0Var, spj<? super s3q0> spjVar) {
        return ((r1i) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x007b, code lost:
    
        if (r1.a(r3, r21) == r2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0225, code lost:
    
        if (r1.a(r3, r21) != r2) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0227, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0206, code lost:
    
        if (r1.a(r3, r21) == r2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01ed, code lost:
    
        if (r1.a(r3, r21) == r2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01d6, code lost:
    
        if (r1.a(r3, r21) != r2) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01bd, code lost:
    
        if (r1.a(r3, r21) == r2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a5, code lost:
    
        if (r1.a(r3, r21) == r2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0195, code lost:
    
        if (r1.a(r3, r21) == r2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x017b, code lost:
    
        if (r1.a(r3, r21) == r2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0162, code lost:
    
        if (r1.a(r3, r21) == r2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0153, code lost:
    
        if (r3 != r2) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0100, code lost:
    
        if (xsna.z1i.a(r3, r1, r21) != r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f1, code lost:
    
        if (r1.a(r7, r21) == r2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00b7, code lost:
    
        if (r1.a(r7, r21) != r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ExtendedCommunityProfile extendedCommunityProfile;
        ExtendedCommunityProfile.d dVar;
        Object a;
        int i;
        ExtendedCommunityProfile extendedCommunityProfile2;
        ali0 ali0Var = (ali0) this.L$0;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.a.a(obj);
                ExtendedCommunityProfile extendedCommunityProfile3 = this.this$0.a;
                if (!extendedCommunityProfile3.g() && (extendedCommunityProfile3.Z == 0 || extendedCommunityProfile3.a0 >= 1)) {
                    e520 e520Var = b2i.m;
                    this.L$0 = ali0Var;
                    this.label = 1;
                    break;
                }
                extendedCommunityProfile = this.this$0.a;
                if (!extendedCommunityProfile.s2 && (dVar = extendedCommunityProfile.C2) != null && dVar.d) {
                    e520 e520Var2 = b2i.a;
                    e520 e520Var3 = new e520(R.id.vk_community_send_review_event, R.drawable.vk_icon_favorite_add_outline_28, R.string.reviews_menu_add_review_item_title, 14, false, 0, 0, false, null, 0, null, false, 8176);
                    this.L$0 = ali0Var;
                    this.label = 2;
                    break;
                }
                if (w2h.a(this.this$0.a)) {
                    e520 e520Var4 = b2i.a;
                    a2i a2iVar = this.this$0.c;
                    e520 e520Var5 = new e520(R.id.vk_community_archive, R.drawable.vk_icon_archive_outline_28, R.string.story_open_community_archive, 0, false, 0, 0, false, null, 0, null, false, 8176);
                    this.L$0 = ali0Var;
                    this.label = 3;
                    break;
                }
                z1i z1iVar = this.this$0;
                this.L$0 = ali0Var;
                this.label = 4;
                break;
            case 1:
                kotlin.a.a(obj);
                extendedCommunityProfile = this.this$0.a;
                if (!extendedCommunityProfile.s2) {
                    e520 e520Var22 = b2i.a;
                    e520 e520Var32 = new e520(R.id.vk_community_send_review_event, R.drawable.vk_icon_favorite_add_outline_28, R.string.reviews_menu_add_review_item_title, 14, false, 0, 0, false, null, 0, null, false, 8176);
                    this.L$0 = ali0Var;
                    this.label = 2;
                    break;
                }
                if (w2h.a(this.this$0.a)) {
                }
                z1i z1iVar2 = this.this$0;
                this.L$0 = ali0Var;
                this.label = 4;
                break;
            case 2:
                kotlin.a.a(obj);
                if (w2h.a(this.this$0.a)) {
                }
                z1i z1iVar22 = this.this$0;
                this.L$0 = ali0Var;
                this.label = 4;
                break;
            case 3:
                kotlin.a.a(obj);
                z1i z1iVar222 = this.this$0;
                this.L$0 = ali0Var;
                this.label = 4;
                break;
            case 4:
                kotlin.a.a(obj);
                z1i z1iVar3 = this.this$0;
                this.L$0 = ali0Var;
                this.label = 5;
                ExtendedCommunityProfile extendedCommunityProfile4 = z1iVar3.a;
                Donut donut = extendedCommunityProfile4.t2;
                String str = donut != null ? donut.c : null;
                if (epx.f(str, SignalingProtocol.KEY_ACTIVE)) {
                    Donut donut2 = extendedCommunityProfile4.t2;
                    if ((donut2 != null ? donut2.d : null) != null) {
                        a = ali0Var.a(b2i.b, this);
                        if (a != obj2) {
                            a = s3q0.a;
                            break;
                        }
                    }
                    a = s3q0.a;
                    break;
                } else {
                    if (epx.f(str, "expiring")) {
                        Donut donut3 = extendedCommunityProfile4.t2;
                        if ((donut3 != null ? donut3.d : null) != null) {
                            a = ali0Var.a(b2i.c, this);
                            if (a != obj2) {
                                a = s3q0.a;
                                break;
                            }
                        }
                    }
                    a = s3q0.a;
                }
                return s3q0.a;
            case 5:
                kotlin.a.a(obj);
                e520 e520Var6 = b2i.d;
                this.L$0 = ali0Var;
                this.label = 6;
                break;
            case 6:
                kotlin.a.a(obj);
                if (this.this$0.a.f()) {
                    e520 e520Var7 = b2i.e;
                    this.L$0 = ali0Var;
                    this.label = 7;
                    break;
                }
                if (w2h.b(this.this$0.a)) {
                    e520 e520Var8 = b2i.f;
                    this.L$0 = ali0Var;
                    this.label = 8;
                    break;
                }
                e520 e520Var9 = b2i.g;
                this.L$0 = ali0Var;
                this.label = 9;
                break;
            case 7:
                kotlin.a.a(obj);
                if (w2h.b(this.this$0.a)) {
                }
                e520 e520Var92 = b2i.g;
                this.L$0 = ali0Var;
                this.label = 9;
                break;
            case 8:
                kotlin.a.a(obj);
                e520 e520Var922 = b2i.g;
                this.L$0 = ali0Var;
                this.label = 9;
                break;
            case 9:
                kotlin.a.a(obj);
                if (this.this$0.a.p2) {
                    e520 e520Var10 = b2i.h;
                    this.L$0 = ali0Var;
                    this.label = 10;
                    break;
                }
                i = this.this$0.a.a1;
                if (i != 1 || i == 2) {
                    e520 e520Var11 = b2i.a;
                    this.L$0 = ali0Var;
                    this.label = 11;
                    break;
                }
                if (this.this$0.a.m2) {
                    e520 e520Var12 = b2i.i;
                    this.L$0 = ali0Var;
                    this.label = 12;
                    break;
                }
                if (fhj0.a.b(this.$context)) {
                    e520 e520Var13 = b2i.j;
                    this.L$0 = ali0Var;
                    this.label = 13;
                    break;
                }
                extendedCommunityProfile2 = this.this$0.a;
                if (extendedCommunityProfile2.s2 && (extendedCommunityProfile2.y2 || extendedCommunityProfile2.x2)) {
                    e520 e520Var14 = b2i.k;
                    this.L$0 = null;
                    this.label = 14;
                    break;
                }
                return s3q0.a;
            case 10:
                kotlin.a.a(obj);
                i = this.this$0.a.a1;
                if (i != 1) {
                }
                e520 e520Var112 = b2i.a;
                this.L$0 = ali0Var;
                this.label = 11;
                break;
            case 11:
                kotlin.a.a(obj);
                if (this.this$0.a.m2) {
                }
                if (fhj0.a.b(this.$context)) {
                }
                extendedCommunityProfile2 = this.this$0.a;
                if (extendedCommunityProfile2.s2) {
                    e520 e520Var142 = b2i.k;
                    this.L$0 = null;
                    this.label = 14;
                    break;
                }
                return s3q0.a;
            case 12:
                kotlin.a.a(obj);
                if (fhj0.a.b(this.$context)) {
                }
                extendedCommunityProfile2 = this.this$0.a;
                if (extendedCommunityProfile2.s2) {
                }
                return s3q0.a;
            case 13:
                kotlin.a.a(obj);
                extendedCommunityProfile2 = this.this$0.a;
                if (extendedCommunityProfile2.s2) {
                }
                return s3q0.a;
            case 14:
                kotlin.a.a(obj);
                return s3q0.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
