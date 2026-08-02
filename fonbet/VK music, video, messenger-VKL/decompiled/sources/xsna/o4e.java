package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.a;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.dto.music.MusicTrack;
import com.vk.ecomm.storefrontservices.impl.StorefrontServicesFragment;
import com.vk.lists.DefaultErrorView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment;
import java.util.Set;
import xsna.d5h;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class o4e implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o4e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        long j3;
        long j4;
        switch (this.b) {
            case 0:
                p4e p4eVar = (p4e) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(242602749, intValue, -1, "com.vk.clips.favorites.impl.ui.folders.picker.content.ClipsFavoritesFoldersPickerContentView.<anonymous>.<anonymous> (ClipsFavoritesFoldersPickerContentView.kt:88)");
                    }
                    boolean y = aVar.y(p4eVar);
                    Object x = aVar.x();
                    if (y || x == a.C0011a.a) {
                        x = new ah(p4eVar, 25);
                        aVar.R(x);
                    }
                    ldv0.b(null, false, null, (gzs) x, aVar, 0, 7);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                int i = naf.k1;
                ((naf) this.c).Yn(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                c1h c1hVar = (c1h) this.c;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                c1hVar.y(floatValue);
                return s3q0.a;
            case 3:
                d5h.c cVar = (d5h.c) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-113306810, intValue2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItem.ViewHolder.<anonymous>.<anonymous> (CommunityInternalMenuItem.kt:270)");
                    }
                    cVar.q6(0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                dri driVar = (dri) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-699407252, intValue3, -1, "com.vk.profile.user.impl.ui.adapter.holders.compose.ComposeUserProfileViewHolder.<anonymous> (ComposeUserProfileViewHolder.kt:20)");
                    }
                    rrv0.d(null, null, null, null, kai.c(2045752401, new com.vk.movika.tools.controls.seekbar.p(driVar, 3), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 5:
                i640 i640Var = (i640) this.c;
                Set set = (Set) obj;
                synchronized (i640Var.a) {
                    try {
                        ph50<Object, Object> ph50Var = i640Var.b;
                        ml1 ml1Var = new ml1(12, set, i640Var);
                        ttp0.d(1, ml1Var);
                        Object[] objArr = ph50Var.b;
                        long[] jArr = ph50Var.a;
                        int length = jArr.length - 2;
                        long j5 = -9187201950435737472L;
                        if (length >= 0) {
                            int i2 = 0;
                            j2 = 128;
                            while (true) {
                                long j6 = jArr[i2];
                                j3 = 255;
                                if ((((~j6) << 7) & j6 & j5) != j5) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        if ((j6 & 255) < 128) {
                                            j4 = j5;
                                            ml1Var.invoke(objArr[(i2 << 3) + i4]);
                                        } else {
                                            j4 = j5;
                                        }
                                        j6 >>= 8;
                                        i4++;
                                        j5 = j4;
                                    }
                                    j = j5;
                                    if (i3 == 8) {
                                    }
                                } else {
                                    j = j5;
                                }
                                if (i2 != length) {
                                    i2++;
                                    j5 = j;
                                }
                            }
                        } else {
                            j = -9187201950435737472L;
                            j2 = 128;
                            j3 = 255;
                        }
                        qh50<ohi0<s3q0>> qh50Var = i640Var.d;
                        Object[] objArr2 = qh50Var.b;
                        long[] jArr2 = qh50Var.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j7 = jArr2[i5];
                                if ((((~j7) << 7) & j7 & j) != j) {
                                    int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        if ((j7 & j3) < j2) {
                                            ((ohi0) objArr2[(i5 << 3) + i7]).f(s3q0.a);
                                        }
                                        j7 >>= 8;
                                    }
                                    if (i6 != 8) {
                                    }
                                }
                                if (i5 != length2) {
                                    i5++;
                                }
                            }
                        }
                        i640Var.d.f();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                qka0.b((q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                qcy<Object>[] qcyVarArr = PlaylistScreenFragment.T;
                ((PlaylistScreenFragment) this.c).eo(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                PostsFromNotificationsFragment postsFromNotificationsFragment = (PostsFromNotificationsFragment) this.c;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                DefaultErrorView defaultErrorView = postsFromNotificationsFragment.c0;
                if (defaultErrorView != null) {
                    defaultErrorView.setVisibility(booleanValue ? 0 : 8);
                }
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                cef0.f((kef0) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 10:
                huh0 huh0Var = (huh0) this.c;
                UIBlockSearchHistory.UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack = (UIBlockSearchHistory.UIBlockSearchHistoryTrack) obj2;
                MusicTrack musicTrack = uIBlockSearchHistoryTrack.A;
                Activity h = e3m.h((Context) obj);
                if (h != null) {
                    ((fl4) huh0Var.b.getValue()).k(h, musicTrack, MusicPlaybackLaunchContext.Fb(uIBlockSearchHistoryTrack.f), uIBlockSearchHistoryTrack.c);
                }
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                ((com.vk.core.compose.component.cell.content.e1) this.c).a(r9g.a, q630.a.a, (androidx.compose.runtime.a) obj, ne7.I(55));
                return s3q0.a;
            case 12:
                StorefrontServicesFragment storefrontServicesFragment = (StorefrontServicesFragment) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr2 = StorefrontServicesFragment.R;
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-351062121, intValue4, -1, "com.vk.ecomm.storefrontservices.impl.StorefrontServicesFragment.onCreateView.<anonymous>.<anonymous> (StorefrontServicesFragment.kt:93)");
                    }
                    nzw nzwVar = storefrontServicesFragment.P;
                    qcy<Object> qcyVar = StorefrontServicesFragment.R[0];
                    ool0 ool0Var = (ool0) nzwVar.getValue();
                    mnl0 mnl0Var = (mnl0) storefrontServicesFragment.Q.getValue();
                    boolean y2 = aVar4.y(mnl0Var);
                    Object x2 = aVar4.x();
                    if (y2 || x2 == a.C0011a.a) {
                        StorefrontServicesFragment.b bVar = new StorefrontServicesFragment.b(1, mnl0Var, mnl0.class, "handleEvent", "handleEvent(Lcom/vk/ecomm/storefrontservices/impl/presentation/feature/StorefrontServicesEvent$Navigation;)V", 0);
                        aVar4.R(bVar);
                        x2 = bVar;
                    }
                    kol0.a(ool0Var, (izs) ((fcy) x2), aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 13:
                us2 us2Var = (us2) this.c;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                aVar5.K(1155161231);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1155161231, intValue5, -1, "com.vk.libvideo.design.compose.utils.TextViewState.Companion.from.<anonymous> (TextViewState.kt:78)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return us2Var;
            default:
                lg90 lg90Var = (lg90) this.c;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1292798853, intValue6, -1, "com.vk.profile.design.compose.onboarding.Icon.<anonymous> (VkHintBanner.kt:136)");
                    }
                    q630 D = s200.D(q630.a.a, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar6.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(lg90Var, null, D, ylu0Var.getIcon().a, aVar6, 440, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ o4e(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
