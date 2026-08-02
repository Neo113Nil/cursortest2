package xsna;

import com.vk.stat.scheme.CommonCommunitiesStat$ClickEvent;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: CommunityNotificationsBottomSheetMenu.kt */
/* loaded from: classes5.dex */
public final class kbh extends o4h {
    public final ExtendedCommunityProfile b;
    public final o1i c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* compiled from: CommunityNotificationsBottomSheetMenu.kt */
    @b6l(c = "com.vk.profile.community.impl.ui.view.CommunityNotificationsBottomSheetMenu$createActionList$1", f = "CommunityNotificationsBottomSheetMenu.kt", l = {36, 44, 57, 66}, m = "invokeSuspend")
    public static final class a extends RestrictedSuspendLambda implements wzs<ali0<? super e520>, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = kbh.this.new a(spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(ali0<? super e520> ali0Var, spj<? super s3q0> spjVar) {
            return ((a) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0113, code lost:
        
            if (r1.a(r6, r22) == r2) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0115, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00db, code lost:
        
            if (r1.a(r7, r22) == r2) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
        
            if (r1.a(r8, r22) == r2) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0068, code lost:
        
            if (r1.a(r8, r22) == r2) goto L51;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            kbh kbhVar;
            kbh kbhVar2;
            ali0 ali0Var = (ali0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                e520 e520Var = new e520(R.id.vk_community_subscribe_post, 0, kbh.this.b.j1 ? R.string.community_unsubscribe_from_posts : R.string.community_subscribe_to_posts, 0, false, 0, 0, false, null, 0, null, false, 8178);
                this.L$0 = ali0Var;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        kotlin.a.a(obj);
                        kbhVar = kbh.this;
                        if (kbhVar.e) {
                            e520 e520Var2 = new e520(R.id.vk_community_subscribe_podcasts, 0, kbhVar.b.e1 ? R.string.unsubscribe_from_podcasts : R.string.subscribe_to_podcasts, 2, false, 0, 0, false, null, 0, null, false, 8178);
                            this.L$0 = ali0Var;
                            this.label = 3;
                        }
                        kbhVar2 = kbh.this;
                        if (kbhVar2.f) {
                        }
                        return s3q0.a;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    kotlin.a.a(obj);
                    kbhVar2 = kbh.this;
                    if (kbhVar2.f) {
                        e520 e520Var3 = new e520(R.id.vk_community_subscribe_live, 0, kbhVar2.b.i1 ? R.string.group_video_live_notify_off : R.string.group_video_live_notify_on, 3, false, 0, 0, false, null, 0, null, false, 8178);
                        this.L$0 = null;
                        this.label = 4;
                    }
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
            kbh kbhVar3 = kbh.this;
            if (kbhVar3.d) {
                e520 e520Var4 = new e520(R.id.vk_community_subscribe_stories, 0, kbhVar3.b.I1 ? R.string.community_unsubscribe_from_stories : R.string.community_subscribe_to_stories, 1, false, 0, 0, false, null, 0, null, false, 8178);
                this.L$0 = ali0Var;
                this.label = 2;
            }
            kbhVar = kbh.this;
            if (kbhVar.e) {
            }
            kbhVar2 = kbh.this;
            if (kbhVar2.f) {
            }
            return s3q0.a;
        }
    }

    public kbh(ExtendedCommunityProfile extendedCommunityProfile, o1i o1iVar, a2i a2iVar) {
        this.b = extendedCommunityProfile;
        this.c = o1iVar;
        boolean z = true;
        this.d = extendedCommunityProfile.H1 || extendedCommunityProfile.I1;
        this.e = extendedCommunityProfile.d1 && !extendedCommunityProfile.g() && (extendedCommunityProfile.k1 == null || extendedCommunityProfile.e1);
        if (!extendedCommunityProfile.h1 || extendedCommunityProfile.g() || (extendedCommunityProfile.k1 != null && !extendedCommunityProfile.i1)) {
            z = false;
        }
        this.f = z;
    }

    @Override // xsna.o4h
    public final List<e520> a() {
        vki0 b = g5z.b(new a(null));
        if (!b.hasNext()) {
            return EmptyList.b;
        }
        Object next = b.next();
        if (!b.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList b2 = y57.b(next);
        while (b.hasNext()) {
            b2.add(b.next());
        }
        return b2;
    }

    @Override // xsna.o4h
    public final String b() {
        return "community_notifications_menu";
    }

    @Override // xsna.o4h
    public final void c(e520 e520Var) {
        int i = e520Var.a;
        o1i o1iVar = this.c;
        if (i == R.id.vk_community_subscribe_post) {
            o1iVar.n(CommonCommunitiesStat$ClickEvent.Source.COMMUNITY_NAVBAR);
            return;
        }
        if (i == R.id.vk_community_subscribe_stories) {
            o1iVar.r();
        } else if (i == R.id.vk_community_subscribe_podcasts) {
            o1iVar.s();
        } else if (i == R.id.vk_community_subscribe_live) {
            o1iVar.j();
        }
    }
}
