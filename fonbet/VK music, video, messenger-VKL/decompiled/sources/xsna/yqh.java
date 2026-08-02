package xsna;

import com.vk.api.generated.groups.dto.GroupsGetVideoLivesResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.ui.profile.d;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CommunityProfileLiveVideosDelegate.kt */
/* loaded from: classes5.dex */
public final class yqh {
    public final hoh a;
    public final io.reactivex.rxjava3.disposables.b b;
    public io.reactivex.rxjava3.disposables.c c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new dv2(8));
    public final UserId e;

    /* compiled from: CommunityProfileLiveVideosDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<GroupsGetVideoLivesResponseDto, Throwable, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(GroupsGetVideoLivesResponseDto groupsGetVideoLivesResponseDto, Throwable th) {
            GroupsGetVideoLivesResponseDto groupsGetVideoLivesResponseDto2 = groupsGetVideoLivesResponseDto;
            Throwable th2 = th;
            yqh yqhVar = (yqh) this.receiver;
            io.reactivex.rxjava3.disposables.c cVar = yqhVar.c;
            if (cVar != null) {
                cVar.dispose();
            }
            io.reactivex.rxjava3.disposables.c cVar2 = yqhVar.c;
            if (cVar2 != null) {
                yqhVar.b.a(cVar2);
            }
            yqhVar.c = null;
            yqhVar.a.invoke(groupsGetVideoLivesResponseDto2 != null ? new d.l.c(new snz(ums0.e(ums0.a, groupsGetVideoLivesResponseDto2.d(), null, null, false, 62))) : new d.l.a(th2));
            return s3q0.a;
        }
    }

    public yqh(UserId userId, hoh hohVar, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = hohVar;
        this.b = bVar;
        this.e = new UserId(Math.abs(userId.b));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(boolean z) {
        if (((Boolean) this.d.getValue()).booleanValue()) {
            this.a.invoke(new d.l.b(z));
            io.reactivex.rxjava3.disposables.c cVar = this.c;
            if (cVar != null) {
                cVar.dispose();
            }
            io.reactivex.rxjava3.disposables.c cVar2 = this.c;
            if (cVar2 != null) {
                this.b.a(cVar2);
            }
            this.c = null;
            dz2 x = yfb.x(xqu.c(new zqu(), this.e, null, 14));
            x.c = true;
            io.reactivex.rxjava3.disposables.c subscribe = rsg0.D0(x).subscribe(new k7(new a(2, this, yqh.class, "handleLoadedData", "handleLoadedData(Lcom/vk/api/generated/groups/dto/GroupsGetVideoLivesResponseDto;Ljava/lang/Throwable;)V", 0), 11));
            this.c = subscribe;
            this.b.b(subscribe);
        }
    }
}
