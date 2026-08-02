package xsna;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.friends.discover.UserDiscoverItem;
import com.vk.friends.discover.UsersDiscoverFragment;
import com.vk.friends.discover.UsersDiscoverPresenter;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.profile.user.impl.ui.ModalUserProfileFragment;
import com.vkontakte.android.data.b;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.a5n0;
import xsna.hwc0;
import xsna.pox0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class z76 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z76(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        View findViewByPosition;
        ListDataSet<Object> listDataSet;
        ListDataSet.ArrayListImpl<Object> arrayListImpl;
        int i = this.b;
        Integer num2 = null;
        int i2 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                u440 u440Var = (u440) obj3;
                if (((q7v0) obj).d((VkOnboardingCampaign) obj2)) {
                    u440Var.h0 = true;
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                int i3 = com.vk.channelrestrictions.b.h1;
                ((com.vk.channelrestrictions.b) obj3).Zn(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((com.vk.core.compose.component.cell.content.f0) obj3).a(r9g.a, q630.a.a, (androidx.compose.runtime.a) obj, ne7.I(55));
                break;
            case 3:
                NewsfeedSearchFragment newsfeedSearchFragment = (NewsfeedSearchFragment) obj3;
                sq60 sq60Var = (sq60) obj2;
                RecyclerView recyclerView = newsfeedSearchFragment.d0;
                if (recyclerView != null) {
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (sq60Var.e) {
                        num = Integer.valueOf(linearLayoutManager != null ? linearLayoutManager.v() : 0);
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        if (linearLayoutManager != null && (findViewByPosition = linearLayoutManager.findViewByPosition(num.intValue())) != null) {
                            i2 = findViewByPosition.getTop();
                        }
                        num2 = Integer.valueOf(i2);
                    }
                    ((ho60) newsfeedSearchFragment.fo().a.s.getValue()).H0(recyclerView, new xz3(3, newsfeedSearchFragment, sq60Var), new jx60(num, num2, linearLayoutManager, newsfeedSearchFragment, sq60Var, 0), sq60Var.a, sq60Var.c);
                    break;
                } else {
                    break;
                }
                break;
            case 4:
                lwc0 lwc0Var = (lwc0) obj3;
                rui ruiVar = (rui) obj;
                nn50 nn50Var = (nn50) obj2;
                final f64 a = ruiVar.a(new pvc0(lwc0Var, nn50Var));
                qn60 qn60Var = lwc0Var.a;
                pn60 pn60Var = lwc0Var.b;
                com.vk.channels.impl.channel_screen.send_msg.c cVar = lwc0Var.i;
                mo60 mo60Var = lwc0Var.e;
                ?? r11 = mo60Var.m;
                ?? r12 = mo60Var.j;
                ?? r13 = mo60Var.i;
                lvc0 lvc0Var = lwc0Var.j;
                final f64 a2 = ruiVar.a(new ivc0(qn60Var, pn60Var, cVar, r11, r12, r13, lvc0Var, nn50Var));
                final f64 a3 = ruiVar.a(new gvc0(lvc0Var, qn60Var, pn60Var, r12, nn50Var));
                es60 es60Var = lwc0Var.k;
                final f64 a4 = ruiVar.a(new z5o0(es60Var, lvc0Var, nn50Var));
                final f64 a5 = ruiVar.a(new y5o0(es60Var, lvc0Var, nn50Var));
                final f64 a6 = ruiVar.a(new jwc0(qn60Var, pn60Var, lvc0Var, nn50Var));
                final f64 a7 = ruiVar.a(new v5o0(es60Var, lvc0Var, nn50Var));
                final f64 a8 = ruiVar.a(new awc0(qn60Var, pn60Var, lvc0Var, nn50Var));
                ruiVar.b = new wzs() { // from class: xsna.yvc0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj4, Object obj5) {
                        qk50 qk50Var = (qk50) obj4;
                        hwc0 hwc0Var = (hwc0) obj5;
                        if (hwc0Var instanceof hwc0.a) {
                            return qk50Var.a(f64.this, hwc0Var);
                        }
                        if (hwc0Var instanceof dwc0) {
                            return qk50Var.a(a2, hwc0Var);
                        }
                        if (hwc0Var instanceof fwc0) {
                            return qk50Var.a(a4, hwc0Var);
                        }
                        if (hwc0Var instanceof cwc0) {
                            return qk50Var.a(a3, hwc0Var);
                        }
                        if (hwc0Var instanceof ewc0) {
                            return qk50Var.a(a5, hwc0Var);
                        }
                        if (hwc0Var instanceof gwc0) {
                            return qk50Var.a(a6, hwc0Var);
                        }
                        if (hwc0Var instanceof bwc0) {
                            return qk50Var.a(a7, hwc0Var);
                        }
                        if (hwc0Var instanceof hwc0.b.a) {
                            return qk50Var.a(a8, hwc0Var);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((ote0) obj3).d(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 6:
                i5n0 i5n0Var = (i5n0) obj3;
                rui ruiVar2 = (rui) obj;
                nn50 nn50Var2 = (nn50) obj2;
                final f64 a9 = ruiVar2.a(new r4n0(i5n0Var, nn50Var2));
                es60 es60Var2 = i5n0Var.k;
                lvc0 lvc0Var2 = i5n0Var.i;
                final f64 a10 = ruiVar2.a(new x5o0(es60Var2, lvc0Var2, nn50Var2));
                final f64 a11 = ruiVar2.a(new w5o0(es60Var2, lvc0Var2, nn50Var2));
                final f64 a12 = ruiVar2.a(new z5o0(es60Var2, lvc0Var2, nn50Var2));
                final f64 a13 = ruiVar2.a(new y5o0(es60Var2, lvc0Var2, nn50Var2));
                final f64 a14 = ruiVar2.a(new b6o0(es60Var2, lvc0Var2, nn50Var2));
                final f64 a15 = ruiVar2.a(new p4n0(es60Var2, lvc0Var2, nn50Var2));
                final f64 a16 = ruiVar2.a(new a6o0(es60Var2, lvc0Var2, nn50Var2));
                ruiVar2.b = new wzs() { // from class: xsna.y4n0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj4, Object obj5) {
                        qk50 qk50Var = (qk50) obj4;
                        a5n0 a5n0Var = (a5n0) obj5;
                        if (a5n0Var instanceof a5n0.b) {
                            return qk50Var.a(f64.this, a5n0Var);
                        }
                        if (a5n0Var instanceof c5n0) {
                            return qk50Var.a(a10, a5n0Var);
                        }
                        if (a5n0Var instanceof e5n0) {
                            return qk50Var.a(a12, a5n0Var);
                        }
                        if (a5n0Var instanceof b5n0) {
                            return qk50Var.a(a11, a5n0Var);
                        }
                        if (a5n0Var instanceof d5n0) {
                            return qk50Var.a(a13, a5n0Var);
                        }
                        if (a5n0Var instanceof f5n0) {
                            return qk50Var.a(a14, a5n0Var);
                        }
                        if (a5n0Var instanceof a5n0.a) {
                            return qk50Var.a(a15, a5n0Var);
                        }
                        if (a5n0Var instanceof g5n0) {
                            return qk50Var.a(a16, a5n0Var);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                break;
            case 7:
                ((Integer) obj2).getClass();
                int i4 = xpp0.l1;
                ((xpp0) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 8:
                UsersDiscoverFragment usersDiscoverFragment = (UsersDiscoverFragment) obj3;
                Integer num3 = (Integer) obj;
                int intValue = num3.intValue();
                int i5 = UsersDiscoverFragment.t0;
                if (obj2 instanceof UserDiscoverItem) {
                    UserDiscoverItem userDiscoverItem = (UserDiscoverItem) obj2;
                    String str = userDiscoverItem.A0;
                    UsersDiscoverPresenter usersDiscoverPresenter = usersDiscoverFragment.T;
                    FragmentActivity activity = usersDiscoverFragment.getActivity();
                    AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
                    if (appCompatActivity != null && !p90.e(appCompatActivity)) {
                        if (usersDiscoverPresenter != null && (listDataSet = usersDiscoverPresenter.c) != null && (arrayListImpl = listDataSet.d) != null) {
                            UserId userId = userDiscoverItem.c;
                            String str2 = userDiscoverItem.n0 ? "recommended" : "request";
                            Iterator<Object> it = arrayListImpl.iterator();
                            int i6 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (!(next instanceof UserDiscoverItem) || !((UserDiscoverItem) next).n0) {
                                        i6++;
                                    }
                                } else {
                                    i6 = -1;
                                }
                            }
                            if (intValue >= i6) {
                                intValue -= i6;
                            }
                            int i7 = userDiscoverItem.n0 ? -1 : usersDiscoverPresenter.e;
                            b.d dVar = new b.d("friend_swipe_open_profile");
                            dVar.b(str2, "type");
                            dVar.b(userId, "user_id");
                            dVar.b(Integer.valueOf(intValue), "offset_in_type");
                            dVar.b(num3, "offset_all");
                            if (i7 >= 0) {
                                dVar.b(Integer.valueOf(i7), "total_in_type");
                            }
                            dVar.e();
                        }
                        int i8 = y1z.a;
                        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
                        if (str == null || str.length() == 0) {
                            str = "id" + userDiscoverItem.c;
                        }
                        UserId userId2 = userDiscoverItem.c;
                        vh3 vh3Var = new vh3(ModalUserProfileFragment.class, null, null);
                        Bundle bundle = vh3Var.j;
                        bundle.putParcelable("id", userId2);
                        bundle.putString("access_key", null);
                        bundle.putBoolean("fit_system_window", false);
                        bundle.putString("screen_name", str);
                        o25.a().N();
                        String str3 = usersDiscoverPresenter != null ? usersDiscoverPresenter.d : null;
                        if (str3 != null && str3.length() != 0) {
                            bundle.putString("referrer", str3);
                        }
                        vh3Var.j().Ab().Td(supportFragmentManager, "ModalUserProfileFragment" + userDiscoverItem.c);
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                mnx0.e((pox0.e.a.C3525a) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ z76(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
