package xsna;

import android.util.SparseArray;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.ui.holders.author.CircularAuthorViewHolder;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.notifications.NotificationEntity;
import com.vk.dto.notifications.NotificationItem;
import com.vk.dto.photo.Photo;
import com.vk.fave.FaveItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Triple;
import xsna.cio0;
import xsna.h5h;
import xsna.pjt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class fdc implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fdc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b5, code lost:
    
        if (xsna.epx.f(r0, r3) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00da  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        NotificationEntity notificationEntity;
        ol60 ol60Var;
        ol60 ol60Var2;
        switch (this.b) {
            case 0:
                CircularAuthorViewHolder circularAuthorViewHolder = (CircularAuthorViewHolder) this.c;
                ComposeView composeView = (ComposeView) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-899959003, intValue, -1, "com.vk.catalog2.common.ui.holders.author.CircularAuthorViewHolder.createView.<anonymous>.<anonymous> (CircularAuthorViewHolder.kt:68)");
                    }
                    Group group = (Group) ((zak0) circularAuthorViewHolder.h).getValue();
                    if (group == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        break;
                    } else {
                        rrv0.d(null, null, null, null, kai.c(-1551631734, new cr7(circularAuthorViewHolder, composeView, group, 2), aVar), aVar, 24576, 15);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((h5h.b) this.c).g((znj) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                izs izsVar = (izs) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                Integer num = (Integer) obj;
                NotificationItem notificationItem = (NotificationItem) obj2;
                Photo photo = (notificationItem == null || (notificationEntity = notificationItem.j) == null) ? null : notificationEntity.g;
                if (photo != null && ((Boolean) izsVar.invoke(photo)).booleanValue()) {
                    if (photo.Hb()) {
                        photo.L = null;
                    }
                    arrayList.add(num);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((fly) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                kh00 kh00Var = (kh00) this.c;
                izs<? super qg00, s3q0> izsVar2 = (izs) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(298980217, intValue2, -1, "com.vk.settings.impl.presentation.base.mvi.communities.ManageCommunitiesNotificationsView.ContentSurface.<anonymous> (ManageCommunitiesNotificationsView.kt:92)");
                    }
                    kh00Var.n(izsVar2, aVar2, 64);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 5:
                HashMap hashMap = (HashMap) this.c;
                SparseArray sparseArray = (SparseArray) this.d;
                Integer num2 = (Integer) obj;
                u1c0 u1c0Var = (u1c0) obj2;
                NewsEntry newsEntry = u1c0Var.b;
                NewsEntry newsEntry2 = u1c0Var.a;
                NewsEntry newsEntry3 = (NewsEntry) hashMap.get(newsEntry);
                if (newsEntry3 != null) {
                    NewsEntry newsEntry4 = epx.f(newsEntry, newsEntry3) ? newsEntry3 : newsEntry;
                    if (!epx.f(newsEntry2, newsEntry3)) {
                        if (newsEntry4 instanceof Post) {
                            Post post = (Post) newsEntry4;
                            if (epx.f(post.D, newsEntry2)) {
                                newsEntry2 = post.D;
                                u1c0 c = lbs.c(u1c0Var, newsEntry2, newsEntry4, 0, 4);
                                ol60Var = u1c0Var.h;
                                if (ol60Var instanceof dio0) {
                                    if (newsEntry2 instanceof Post) {
                                        cio0 cio0Var = new cio0(u1c0Var.m);
                                        dio0 dio0Var = (dio0) ol60Var;
                                        Object a0 = j5g.a0(cio0Var.b(new cio0.a((Post) newsEntry2, newsEntry4, dio0Var.j, dio0Var.k, dio0Var.l)));
                                        ol60Var2 = a0 instanceof dio0 ? (dio0) a0 : null;
                                        if (ol60Var2 == null) {
                                            ol60Var2 = c.h;
                                        }
                                    } else if (newsEntry2 instanceof Videos) {
                                        dio0 dio0Var2 = (dio0) ol60Var;
                                        Object a02 = j5g.a0(new pjt0().a(new pjt0.a((Videos) newsEntry2, newsEntry4, dio0Var2.j, dio0Var2.k, dio0Var2.l)));
                                        ol60Var2 = a02 instanceof dio0 ? (dio0) a02 : null;
                                        if (ol60Var2 == null) {
                                            ol60Var2 = c.h;
                                        }
                                    } else if (newsEntry2 instanceof FaveEntry) {
                                        Object a03 = j5g.a0(new eks0().a(0, new Triple(newsEntry2, newsEntry4, ((dio0) ol60Var).l)));
                                        ol60Var2 = a03 instanceof dio0 ? (dio0) a03 : null;
                                        if (ol60Var2 == null) {
                                            ol60Var2 = c.h;
                                        }
                                    } else {
                                        ol60Var2 = c.h;
                                    }
                                    dio0 dio0Var3 = ol60Var2 instanceof dio0 ? (dio0) ol60Var2 : null;
                                    if (dio0Var3 == null) {
                                        dio0Var3 = (dio0) ol60Var;
                                    }
                                    dio0 dio0Var4 = (dio0) ol60Var;
                                    c.h = dio0.i(dio0Var3, null, dio0Var4.t, dio0Var4.u, 16764927);
                                }
                                sparseArray.append(num2.intValue(), c);
                            }
                        }
                        if (newsEntry4 instanceof PromoPost) {
                            newsEntry3 = ((PromoPost) newsEntry4).n;
                            break;
                        }
                        if (newsEntry4 instanceof FaveEntry) {
                            FaveItem faveItem = ((FaveEntry) newsEntry4).i;
                            if (epx.f(faveItem.f, newsEntry2)) {
                                newsEntry2 = (NewsEntry) faveItem.f;
                            }
                        }
                        u1c0 c2 = lbs.c(u1c0Var, newsEntry2, newsEntry4, 0, 4);
                        ol60Var = u1c0Var.h;
                        if (ol60Var instanceof dio0) {
                        }
                        sparseArray.append(num2.intValue(), c2);
                    }
                    newsEntry2 = newsEntry3;
                    u1c0 c22 = lbs.c(u1c0Var, newsEntry2, newsEntry4, 0, 4);
                    ol60Var = u1c0Var.h;
                    if (ol60Var instanceof dio0) {
                    }
                    sparseArray.append(num2.intValue(), c22);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                zs70.g((dt70) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                vma0.h((rxm0) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                com.vk.ecomm.product_list.presentation.g.g((dsy) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((aen0) this.c).g((znj) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fdc(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ fdc(HashMap hashMap, ab60 ab60Var, SparseArray sparseArray) {
        this.b = 5;
        this.c = hashMap;
        this.d = sparseArray;
    }
}
