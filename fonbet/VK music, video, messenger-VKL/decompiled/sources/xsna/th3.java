package xsna;

import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.feature.news.model.UIBlockFeed;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import xsna.pb60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class th3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ th3(Attachment attachment, pb60.a aVar) {
        this.b = 7;
        this.c = attachment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b1  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int T2;
        u1c0 u1c0Var;
        List singletonList;
        int i = this.b;
        char c = 1;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i2 = ArchiveFragment.e0;
                break;
            case 1:
                s5h s5hVar = (s5h) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(879277198, intValue, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItemViewHolder.<anonymous> (CommunityInternalMenuItemViewHolder.kt:54)");
                    }
                    rrv0.a(null, null, kai.c(-465130698, new oac(s5hVar, c == true ? 1 : 0), aVar), aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                aev.a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((uiy) obj3).d(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((uzy) obj3).a(ne7.I(55), (androidx.compose.runtime.a) obj);
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((vn20) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 6:
                lb40 lb40Var = (lb40) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1901973085, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.MusicBigPlayerControls.Content.<anonymous> (MusicBigPlayerControls.kt:41)");
                    }
                    Boolean bool = (Boolean) ((zak0) lb40Var.c).getValue();
                    if (bool == null) {
                        aVar2.K(-1823345237);
                    } else {
                        aVar2.K(-1823345236);
                        lb40Var.f(bool.booleanValue(), aVar2, 0);
                    }
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 7:
                Attachment attachment = (Attachment) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                ArrayList arrayList2 = new ArrayList();
                for (UIBlock uIBlock : arrayList) {
                    if (uIBlock.e.i()) {
                        UIBlockFeed uIBlockFeed = (UIBlockFeed) uIBlock;
                        u1c0 u1c0Var2 = uIBlockFeed.y;
                        NewsEntry newsEntry = u1c0Var2.a;
                        Object[] objArr = (newsEntry instanceof fsx0) && ((fsx0) newsEntry).M6(attachment);
                        u1c0 u1c0Var3 = null;
                        Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
                        Post post2 = post != null ? post.D : null;
                        Object[] objArr2 = post2 != null && post2.Eb(attachment);
                        if (objArr == true || objArr2 == true) {
                            if (objArr == true) {
                                fsx0 fsx0Var = (fsx0) newsEntry;
                                int T22 = fsx0Var.T2(attachment);
                                if (T22 >= 0) {
                                    fsx0Var.V5(T22, attachment);
                                }
                            } else if (post2 != null && (T2 = post2.T2(attachment)) >= 0) {
                                post2.V5(T2, attachment);
                            }
                            if (u1c0Var2 instanceof u880) {
                                u880 u880Var = (u880) u1c0Var2;
                                if (lbs.a(u880Var, attachment)) {
                                    u1c0Var3 = lbs.i(u880Var);
                                    u1c0Var = u1c0Var3;
                                    if (u1c0Var != null) {
                                        uIBlockFeed = new UIBlockFeed(sua.l(uIBlockFeed), uIBlockFeed.j, u1c0Var, uIBlockFeed.A, uIBlockFeed.B, uIBlockFeed.k, uIBlockFeed.Qb());
                                    }
                                    singletonList = Collections.singletonList(uIBlockFeed);
                                }
                            }
                            if (u1c0Var2 instanceof k5i) {
                                k5i k5iVar = (k5i) u1c0Var2;
                                if (epx.f(k5iVar.q, attachment)) {
                                    u1c0Var3 = lbs.g(k5iVar, attachment);
                                    u1c0Var = u1c0Var3;
                                    if (u1c0Var != null) {
                                    }
                                    singletonList = Collections.singletonList(uIBlockFeed);
                                }
                            }
                            if (u1c0Var2 instanceof lsi) {
                                lsi lsiVar = (lsi) u1c0Var2;
                                if (epx.f(lsiVar.q, attachment)) {
                                    u1c0Var3 = lbs.h(lsiVar, attachment);
                                    u1c0Var = u1c0Var3;
                                    if (u1c0Var != null) {
                                    }
                                    singletonList = Collections.singletonList(uIBlockFeed);
                                }
                            }
                            if (u1c0Var2 instanceof r74) {
                                r74 r74Var = (r74) u1c0Var2;
                                if (epx.f(r74Var.q, attachment)) {
                                    u1c0Var3 = lbs.d(r74Var, attachment);
                                    u1c0Var = u1c0Var3;
                                    if (u1c0Var != null) {
                                    }
                                    singletonList = Collections.singletonList(uIBlockFeed);
                                }
                            }
                            if (u1c0Var2 instanceof w84) {
                                w84 w84Var = (w84) u1c0Var2;
                                if (w84Var.q.contains(attachment)) {
                                    u1c0Var3 = lbs.e(w84Var, attachment);
                                }
                            }
                            u1c0Var = u1c0Var3;
                            if (u1c0Var != null) {
                            }
                            singletonList = Collections.singletonList(uIBlockFeed);
                        } else {
                            singletonList = Collections.singletonList(uIBlock);
                        }
                    } else {
                        singletonList = Collections.singletonList(uIBlock);
                    }
                    g5g.y(singletonList, arrayList2);
                }
                break;
            case 8:
                u3s0 u3s0Var = (u3s0) obj3;
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                float f = (floatValue2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || floatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0.0f : floatValue / floatValue2;
                if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = 0.83f;
                }
                u3s0Var.i7(f);
                break;
            case 9:
                ((pii0) obj3).startActivityForResult((Intent) obj, ((Integer) obj2).intValue());
                break;
            case 10:
                g7n0 g7n0Var = (g7n0) obj3;
                ((Float) obj2).getClass();
                Pair f2 = g7n0.f((RecyclerView.e0) obj);
                if (f2 == null) {
                    break;
                } else {
                    g7n0Var.g(((Number) f2.g()).intValue(), (String) f2.d(), true);
                    break;
                }
            case 11:
                ((Integer) obj2).getClass();
                int i3 = jmu0.g1;
                ((jmu0) obj3).Yn(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 12:
                ((Integer) obj2).getClass();
                ((anx0) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                ((xox0) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ th3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ th3(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
