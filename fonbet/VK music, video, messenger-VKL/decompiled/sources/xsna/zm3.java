package xsna;

import android.content.Context;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.vk.articles.authorpage.ArticleAuthorPageSortType;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.articles.authorpage.ui.ArticleAuthorPageRecyclerPaginatedView;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.articles.Article;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.common.data.VKList;
import com.vk.dto.friends.discover.UserDiscoverItem;
import com.vk.dto.user.RequestUserProfile;
import com.vk.friends.discover.UsersDiscoverPresenter;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dop0;
import xsna.unp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class zm3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zm3(UsersDiscoverPresenter usersDiscoverPresenter, boolean z, com.vk.lists.c cVar) {
        this.b = 3;
        this.d = usersDiscoverPresenter;
        this.c = z;
        this.e = cVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        r1 = null;
        r1 = null;
        String str = null;
        r1 = null;
        String str2 = null;
        r1 = null;
        String str3 = null;
        Object obj2 = this.e;
        boolean z = this.c;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                gn3 gn3Var = (gn3) obj3;
                ArticleAuthorPageFragment articleAuthorPageFragment = gn3Var.b;
                com.vk.lists.c cVar = (com.vk.lists.c) obj2;
                ro3 ro3Var = (ro3) obj;
                if (z) {
                    articleAuthorPageFragment.jo();
                }
                VKList<Article> vKList = ro3Var.a;
                ArrayList arrayList = new ArrayList(vKList.size());
                if (z) {
                    pm3 pm3Var = ro3Var.b;
                    gn3Var.e = pm3Var;
                    boolean z2 = ((pm3Var.f && !pm3Var.a()) || gn3Var.e.h || o25.a().a(gn3Var.e.a.b)) ? false : true;
                    VkText vkText = articleAuthorPageFragment.V;
                    if (vkText != null) {
                        vkText.setText(pm3Var.a.c);
                    }
                    VkPlaceholder vkPlaceholder = articleAuthorPageFragment.W;
                    if (vkPlaceholder != null) {
                        vkPlaceholder.setWithPaddings(false);
                    }
                    articleAuthorPageFragment.oo(pm3Var, z2);
                    ArticleAuthorPageRecyclerPaginatedView articleAuthorPageRecyclerPaginatedView = articleAuthorPageFragment.Y;
                    if (articleAuthorPageRecyclerPaginatedView != null) {
                        articleAuthorPageRecyclerPaginatedView.setSwipeRefreshEnabled(true);
                    }
                    MenuItem menuItem = articleAuthorPageFragment.X;
                    if (menuItem != null) {
                        menuItem.setVisible(true);
                    }
                    VkText vkText2 = articleAuthorPageFragment.Z;
                    if (vkText2 != null) {
                        f4m.j(vkText2);
                    }
                    Toolbar toolbar = articleAuthorPageFragment.U;
                    if (toolbar != null) {
                        ArticleAuthorPageFragment.ko(toolbar);
                    }
                    if (vKList.i() > 0) {
                        qm3 qm3Var = articleAuthorPageFragment.b0;
                        if (qm3Var == null) {
                            qm3Var = null;
                        }
                        if (!(qm3Var.c.c(0) instanceof ln3)) {
                            ArticleAuthorPageSortType articleAuthorPageSortType = gn3Var.f;
                            ln3 ln3Var = new ln3();
                            ln3Var.a = articleAuthorPageSortType;
                            arrayList.add(ln3Var);
                        }
                    }
                    articleAuthorPageFragment.mo(true);
                }
                Iterator<Article> it = vKList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    int i3 = i2 + 1;
                    Article next = it.next();
                    if (i2 == 0) {
                        arrayList.add(new ym3(next, next.l != null));
                    } else {
                        arrayList.add(new ym3(next, false));
                    }
                    i2 = i3;
                }
                cVar.l(vKList.i());
                qm3 qm3Var2 = articleAuthorPageFragment.b0;
                (qm3Var2 != null ? qm3Var2 : null).n0(arrayList);
                return s3q0.a;
            case 1:
                unp0 unp0Var = (unp0) obj2;
                tb20 tb20Var = (tb20) obj;
                ez80 ez80Var = new ez80((String) obj3, z);
                dop0.b bVar = dop0.b.a;
                if ((unp0Var instanceof unp0.b) || (unp0Var instanceof unp0.a)) {
                    unp0Var = unp0.b.a;
                } else if (!(unp0Var instanceof unp0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                return tb20.a(tb20Var, ez80Var, bVar, unp0Var, null, false, 24);
            case 2:
                dbi0 dbi0Var = (dbi0) obj3;
                Context context = (Context) obj2;
                tgi0 tgi0Var = (tgi0) obj;
                int i4 = dbi0.r1;
                qgi0.h(tgi0Var, (z && dbi0Var.fo()) ? context.getString(R.string.music_picker_selected_snippet_screen_setting_disable) : context.getString(R.string.music_picker_selected_snippet_screen_setting_enable));
                qgi0.r(tgi0Var, "MusicSnippetEditorSwitchButton");
                return s3q0.a;
            default:
                UsersDiscoverPresenter usersDiscoverPresenter = (UsersDiscoverPresenter) obj3;
                com.vk.lists.c cVar2 = (com.vk.lists.c) obj2;
                UsersDiscoverPresenter.a aVar = (UsersDiscoverPresenter.a) obj;
                String str4 = aVar.e;
                VKFromList<RequestUserProfile> vKFromList = aVar.d;
                boolean z3 = aVar.c;
                usersDiscoverPresenter.j = str4;
                ArrayList<UserDiscoverItem> arrayList2 = usersDiscoverPresenter.h;
                ListDataSet<Object> listDataSet = usersDiscoverPresenter.c;
                s170 s170Var = usersDiscoverPresenter.f;
                s170 s170Var2 = usersDiscoverPresenter.g;
                if (z && !z3) {
                    s170Var.e(cVar2.k() + s170Var.a());
                    listDataSet.clear();
                    usersDiscoverPresenter.e = 0;
                    usersDiscoverPresenter.k = null;
                    usersDiscoverPresenter.i = null;
                    gps gpsVar = aVar.a;
                    if (gpsVar != null) {
                        List<? extends RequestUserProfile> list = gpsVar.b;
                        usersDiscoverPresenter.i = gpsVar.c;
                        VKFromList<RequestUserProfile> vKFromList2 = gpsVar.d.a;
                        s170Var2.f((vKFromList2.isEmpty() || usersDiscoverPresenter.g()) ? null : vKFromList2.i());
                        ArrayList<UserDiscoverItem> z4 = list != null ? usersDiscoverPresenter.z(list) : null;
                        if (z4 == null || z4.isEmpty()) {
                            s170Var.f(null);
                        } else {
                            usersDiscoverPresenter.b(z4);
                            usersDiscoverPresenter.e = z4.size() + usersDiscoverPresenter.e;
                        }
                        ArrayList<UserDiscoverItem> z5 = usersDiscoverPresenter.z(vKFromList2);
                        if (z5.size() > 0) {
                            if (s170Var.b() == null) {
                                z7i z7iVar = new z7i(usersDiscoverPresenter.i, z5);
                                listDataSet.s(z7iVar);
                                usersDiscoverPresenter.k = z7iVar;
                                usersDiscoverPresenter.b(z5);
                            } else {
                                arrayList2.addAll(z5);
                            }
                        }
                        g620.s(gpsVar.a);
                        if (s170Var.b() == null) {
                            cVar2.s(s170Var2.b());
                        } else {
                            cVar2.s(s170Var.b());
                        }
                    } else {
                        cVar2.s(null);
                    }
                } else if (z && z3) {
                    listDataSet.clear();
                    usersDiscoverPresenter.e = 0;
                    usersDiscoverPresenter.k = null;
                    usersDiscoverPresenter.i = null;
                    if (vKFromList != null) {
                        usersDiscoverPresenter.b(usersDiscoverPresenter.z(vKFromList));
                    }
                    String j = cVar2.j();
                    cVar2.r((j == null || j.length() == 0 || vKFromList == null || vKFromList.isEmpty()) ? false : true);
                    if (vKFromList != null && !vKFromList.isEmpty() && !usersDiscoverPresenter.g()) {
                        str = vKFromList.i();
                    }
                    cVar2.s(str);
                } else {
                    List<? extends RequestUserProfile> list2 = aVar.b;
                    if (list2 != null) {
                        s170Var.e(cVar2.k() + s170Var.a());
                        ArrayList<UserDiscoverItem> z6 = usersDiscoverPresenter.z(list2);
                        if (z6.isEmpty()) {
                            s170Var.f(null);
                        } else {
                            usersDiscoverPresenter.b(z6);
                            usersDiscoverPresenter.e = z6.size() + usersDiscoverPresenter.e;
                        }
                        if (s170Var.b() == null) {
                            cVar2.s(s170Var2.b());
                        } else {
                            cVar2.s(s170Var.b());
                        }
                    } else if (vKFromList != null && z3) {
                        ArrayList<UserDiscoverItem> z7 = usersDiscoverPresenter.z(vKFromList);
                        usersDiscoverPresenter.b(z7);
                        String j2 = cVar2.j();
                        cVar2.r((j2 == null || j2.length() == 0 || z7.isEmpty()) ? false : true);
                        if (!z7.isEmpty() && !usersDiscoverPresenter.g()) {
                            str2 = vKFromList.i();
                        }
                        cVar2.s(str2);
                    } else if (vKFromList != null && !z3) {
                        ArrayList<UserDiscoverItem> z8 = usersDiscoverPresenter.z(vKFromList);
                        z7i z7iVar2 = usersDiscoverPresenter.k;
                        if (z7iVar2 != null) {
                            ArrayList<UserDiscoverItem> arrayList3 = z7iVar2.b;
                            arrayList3.addAll(arrayList2);
                            if (arrayList3.size() < 3) {
                                arrayList3.addAll(z8);
                            }
                            listDataSet.D(z7iVar2, z7iVar2);
                        } else {
                            String str5 = usersDiscoverPresenter.i;
                            ArrayList arrayList4 = new ArrayList(arrayList2);
                            z7i z7iVar3 = new z7i(str5, arrayList4);
                            if (arrayList4.size() < 3) {
                                arrayList4.addAll(z8);
                            }
                            listDataSet.s(z7iVar3);
                            usersDiscoverPresenter.k = z7iVar3;
                        }
                        if (!arrayList2.isEmpty()) {
                            usersDiscoverPresenter.b(arrayList2);
                            arrayList2.clear();
                        }
                        usersDiscoverPresenter.b(z8);
                        String j3 = cVar2.j();
                        cVar2.r((j3 == null || j3.length() == 0 || z8.isEmpty()) ? false : true);
                        if (!z8.isEmpty() && !usersDiscoverPresenter.g()) {
                            str3 = vKFromList.i();
                        }
                        cVar2.s(str3);
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ zm3(String str, boolean z, wb20 wb20Var, unp0 unp0Var) {
        this.b = 1;
        this.d = str;
        this.c = z;
        this.e = unp0Var;
    }

    public /* synthetic */ zm3(boolean z, Object obj, Object obj2, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
        this.e = obj2;
    }
}
