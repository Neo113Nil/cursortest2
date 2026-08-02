package xsna;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.bridges.ProfileType;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemListVh;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Good;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.ui.permissions.PictureInPicturePermissionFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cwb0;
import xsna.idh0;
import xsna.k1u0;
import xsna.q630;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class pps implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pps(Post post, Context context, Runnable runnable) {
        this.b = 2;
        this.c = post;
        this.e = context;
        this.d = runnable;
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [T, com.vk.dto.common.id.UserId, java.lang.Object] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VkCell.Middle.e eVar;
        VkCell.Middle.e eVar2;
        int i = this.b;
        VkCell.Middle.b bVar = null;
        r2 = null;
        VkCell.Middle.e eVar3 = null;
        bVar = null;
        r2 = null;
        VkCell.Middle.e eVar4 = null;
        int i2 = 3;
        int i3 = 26;
        boolean z = true;
        z = true;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                FriendsItemListVh friendsItemListVh = (FriendsItemListVh) obj4;
                VkCell.Middle.e.b bVar2 = (VkCell.Middle.e.b) obj3;
                Context context = (Context) obj2;
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                VkCell vkCell = friendsItemListVh.j;
                VkCell vkCell2 = vkCell == null ? null : vkCell;
                if ((bVar2 instanceof VkCell.Middle.e.b.C0817b) || bVar2 == null) {
                    if (vkCell == null) {
                        vkCell = null;
                    }
                    VkCell.Middle.b middle = vkCell.getMiddle();
                    if (middle != null) {
                        VkCell vkCell3 = friendsItemListVh.j;
                        if (vkCell3 == null) {
                            vkCell3 = null;
                        }
                        VkCell.Middle.b middle2 = vkCell3.getMiddle();
                        if (middle2 != null && (eVar = middle2.a) != null) {
                            eVar4 = VkCell.Middle.e.a(eVar, new VkCell.Middle.e.b.C0817b(new eko(bitmapDrawable), k1u0.c.a, (tlo0.f) null, FriendsItemListVh.g(context), 4));
                        }
                        bVar = VkCell.Middle.b.a(middle, eVar4);
                    }
                } else if (bVar2 instanceof VkCell.Middle.e.b.c) {
                    if (vkCell == null) {
                        vkCell = null;
                    }
                    VkCell.Middle.b middle3 = vkCell.getMiddle();
                    if (middle3 != null) {
                        VkCell vkCell4 = friendsItemListVh.j;
                        if (vkCell4 == null) {
                            vkCell4 = null;
                        }
                        VkCell.Middle.b middle4 = vkCell4.getMiddle();
                        if (middle4 != null && (eVar2 = middle4.a) != null) {
                            eVar3 = VkCell.Middle.e.a(eVar2, new VkCell.Middle.e.b.c(new VkCell.Middle.e.b.C0817b(new eko(bitmapDrawable), k1u0.c.a, (tlo0.f) null, FriendsItemListVh.g(context), 4), ((VkCell.Middle.e.b.c) bVar2).b));
                        }
                        bVar = VkCell.Middle.b.a(middle3, eVar3);
                    }
                } else {
                    if (!(bVar2 instanceof VkCell.Middle.e.b.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = (vkCell != null ? vkCell : null).getMiddle();
                }
                vkCell2.setMiddle(bVar);
                return s3q0.a;
            case 1:
                Good good = (Good) obj4;
                ssw sswVar = (ssw) obj3;
                NewsEntry newsEntry = (NewsEntry) obj2;
                if (((BaseOkResponseDto) obj) == BaseOkResponseDto.OK) {
                    good.x++;
                    ((p870) sswVar.a).e(102, newsEntry);
                }
                return s3q0.a;
            case 2:
                Post post = (Post) obj4;
                Context context2 = (Context) obj2;
                Runnable runnable = (Runnable) obj3;
                Post post2 = (Post) obj;
                if (!post2.pc()) {
                    ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
                    jt50.a(SingleEvent.POST);
                }
                ce60.b.getClass();
                p870.f().e(100, post);
                p870.f().e(105, post2);
                iuc0 iuc0Var = iuc0.b;
                iuc0.j0(context2, iuc0.i0(post.m));
                if (runnable != null) {
                    runnable.run();
                }
                return s3q0.a;
            case 3:
                idh0.a aVar = (idh0.a) obj4;
                final jdj0 jdj0Var = (jdj0) obj2;
                rry rryVar = (rry) obj;
                ArrayList arrayList = aVar.b;
                wow wowVar = new wow(arrayList);
                rryVar.a(arrayList.size(), null, new he1(wowVar, 2), new jai(-1942245546, new hch0(wowVar, (izs) obj3, jdj0Var), true));
                if (!aVar.c) {
                    rry.d(rryVar, 5 - ((aVar.b.size() + 2) % 3), null, new jai(1639271881, new zzs() { // from class: xsna.dch0
                        @Override // xsna.zzs
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            ((Integer) obj6).getClass();
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj7;
                            int intValue = ((Integer) obj8).intValue();
                            if (aVar2.t(intValue & 1, (intValue & 129) != 128)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1639271881, intValue, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.ClipsGrid.<anonymous>.<anonymous>.<anonymous> (Screen.kt:231)");
                                }
                                c7d.b(jdj0.this, sua.d(0.5625f, q630.a.a, false), aVar2, 56, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar2.h();
                            }
                            return s3q0.a;
                        }
                    }, true), 14);
                }
                return s3q0.a;
            case 4:
                tho0 tho0Var = (tho0) obj;
                ((wh50) obj3).setValue(tho0Var);
                owi.a(obj4, 300L, new defpackage.e0(i3, (izs) obj2, tho0Var));
                return s3q0.a;
            case 5:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) obj4;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                Boolean bool = (Boolean) obj;
                b25 b25Var = gVar.w;
                ?? c = b25Var.c();
                if (!ref$BooleanRef.element && bool.booleanValue()) {
                    gVar.y.getClass();
                }
                boolean z2 = b25Var.c0() == ProfileType.RELATED;
                boolean f = epx.f(ref$ObjectRef.element, c);
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_REOPEN_DISCOVERY;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures)) {
                    z = z2;
                } else if (!z2 && f) {
                    z = false;
                }
                ref$ObjectRef.element = c;
                ref$BooleanRef.element = bool.booleanValue();
                return new Pair(bool, Boolean.valueOf(z));
            default:
                gvw0 gvw0Var = (gvw0) obj4;
                PictureInPicturePermissionFragment pictureInPicturePermissionFragment = (PictureInPicturePermissionFragment) obj;
                spv0 spv0Var = new spv0(z ? 1 : 0, gvw0Var, (vq6) obj3);
                d5 d5Var = new d5(i3, gvw0Var, (k7y) obj2);
                gvw0 gvw0Var2 = pictureInPicturePermissionFragment.N;
                if (gvw0Var2 == null || !gvw0Var2.c()) {
                    pictureInPicturePermissionFragment.P = spv0Var;
                    pictureInPicturePermissionFragment.Q = d5Var;
                    bzb0 bzb0Var = pictureInPicturePermissionFragment.O;
                    if (bzb0Var != null) {
                        bzb0.d(bzb0Var, new cwb0.a1(0, null, R.string.voip_permission_required_content, null, R.string.voip_go_to_settings, null, R.string.cancel, null, null, cwb0.c1.c.a, 427), new su80(pictureInPicturePermissionFragment, i2), new com.vk.movika.sdk.base.logic.processor.actions.e(16, d5Var, pictureInPicturePermissionFragment), new j3(21, d5Var, pictureInPicturePermissionFragment), 16);
                    }
                } else {
                    spv0Var.invoke();
                    pictureInPicturePermissionFragment.tn();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ pps(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
