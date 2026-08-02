package xsna;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.articles.ArticleFragment;
import com.vk.articles.api.preload.QueryParameters;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.attachpicker.screen.h;
import com.vk.avatarpicker.c;
import com.vk.core.simplescreen.ScreenContainer;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.im.ui.fragments.ChatMakeLinkFragment;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.newsfeed.common.views.header.CompactHeaderAvatarView;
import com.vk.newsfeed.common.views.header.HeaderPhotoView;
import com.vk.notifications.settings.CommunitiesManageNotificationsFragment;
import com.vk.photo.editor.views.ToolBottomView;
import com.vk.profile.ui.community.CommunityPickerFragment;
import com.vk.stickers.bottomsheets.LegoStickersBottomSheetDialog;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.h7u0;
import xsna.l5a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class yn3 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yn3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0205  */
    /* JADX WARN: Type inference failed for: r2v16, types: [xsna.j34] */
    /* JADX WARN: Type inference failed for: r2v9, types: [xsna.j34] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        Article article;
        SnippetAttachment g;
        String str;
        QueryParameters queryParameters;
        MediaStoreEntry L;
        int i = this.b;
        int i2 = 0;
        int i3 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                ArticleFragment articleFragment = (ArticleFragment) obj;
                int i4 = ArticleFragment.E0;
                FragmentActivity activity = articleFragment.getActivity();
                if (activity != null && (article = articleFragment.T) != null) {
                    if (!articleFragment.Ac()) {
                        SnippetAttachment snippetAttachment = articleFragment.V;
                        if (snippetAttachment != null) {
                            g = snippetAttachment;
                        } else {
                            String str2 = article.i;
                            g = str2 != null ? gnq.g(article.l, str2, article.n) : null;
                        }
                        if (g != null) {
                            enq.j(activity, g, new pqq(article.d, null, null, null, 14), new fo3(article, articleFragment, activity), new ea3(article, articleFragment, activity, i3), false, null, 96);
                            break;
                        } else {
                            L.l("Can't change fave without snippet " + article);
                            break;
                        }
                    } else {
                        QueryParameters queryParameters2 = articleFragment.W;
                        if (queryParameters2 != null) {
                            String str3 = (String) queryParameters2.b.get("article_id");
                            Integer m = str3 != null ? arm0.m(10, str3) : null;
                            int i5 = article.b;
                            if (m != null && m.intValue() == i5 && (queryParameters = articleFragment.W) != null) {
                                str = (String) queryParameters.b.get("track_code");
                                ArticleAttachment articleAttachment = new ArticleAttachment(article);
                                String str4 = article.d;
                                QueryParameters queryParameters3 = articleFragment.W;
                                enq.j(activity, articleAttachment, new pqq(str4, queryParameters3 != null ? (String) queryParameters3.b.get("ref") : null, str, null, 8), new ri1(article, articleFragment, activity, i3), new eo3(article, articleFragment, activity, i2), false, null, 96);
                                break;
                            }
                        }
                        str = null;
                        ArticleAttachment articleAttachment2 = new ArticleAttachment(article);
                        String str42 = article.d;
                        QueryParameters queryParameters32 = articleFragment.W;
                        enq.j(activity, articleAttachment2, new pqq(str42, queryParameters32 != null ? (String) queryParameters32.b.get("ref") : null, str, null, 8), new ri1(article, articleFragment, activity, i3), new eo3(article, articleFragment, activity, i2), false, null, 96);
                    }
                }
                break;
            case 1:
                z16 z16Var = (z16) obj;
                n16 n16Var = z16Var.A;
                if (n16Var != null) {
                    n16Var.a(z16Var.z);
                    break;
                }
                break;
            case 2:
                ((gzs) obj).invoke();
                break;
            case 3:
                qcy<Object>[] qcyVarArr = ChatMakeLinkFragment.U;
                ((ChatMakeLinkFragment) obj).finish();
                break;
            case 4:
                ((s0e) obj).d.K(null);
                break;
            case 5:
                CommunitiesManageNotificationsFragment communitiesManageNotificationsFragment = (CommunitiesManageNotificationsFragment) obj;
                if (!communitiesManageNotificationsFragment.X) {
                    h7u0.a aVar = new h7u0.a(communitiesManageNotificationsFragment.requireContext());
                    aVar.U(R.string.group_notification_settings_max_limit);
                    aVar.c0(R.string.ok, null);
                    aVar.m();
                    break;
                } else {
                    new CommunityPickerFragment.a().g(1, communitiesManageNotificationsFragment);
                    break;
                }
            case 6:
                HeaderPhotoView.c cVar = ((CompactHeaderAvatarView) obj).f;
                if (cVar != null) {
                    cVar.S1();
                    break;
                }
                break;
            case 7:
                y5l y5lVar = (y5l) obj;
                mhy.a(y5lVar.itemView.getContext(), y5lVar.E.getDescriptionText());
                cvk.u(R.string.text_copied, false);
                break;
            case 8:
                ((xxm) obj).b.performClick();
                break;
            case 9:
                kpp kppVar = opp.T;
                Object obj2 = ((opp) obj).o;
                ((hpp) (obj2 != null ? obj2 : null)).a();
                break;
            case 10:
                com.vk.inappreview.impl.fake.a aVar2 = (com.vk.inappreview.impl.fake.a) obj;
                aVar2.An(true);
                aVar2.dismiss();
                break;
            case 11:
                ((e4w) obj).a();
                break;
            case 12:
                int i6 = LegoStickersBottomSheetDialog.d0;
                ((LegoStickersBottomSheetDialog) obj).fo();
                break;
            case 13:
                lu50 lu50Var = (lu50) obj;
                lu50Var.G6(lu50Var.F);
                break;
            case 14:
                ((zs90) obj).l.a();
                break;
            case 15:
                c.a aVar3 = ((com.vk.avatarpicker.c) obj).k;
                if (aVar3 != null) {
                    aVar3.J();
                    break;
                }
                break;
            case 16:
                int i7 = SettingsListFragment.X0;
                UsableRecyclerView usableRecyclerView = ((SettingsListFragment) obj).n0;
                if (usableRecyclerView != null) {
                    usableRecyclerView.scrollToPosition(0);
                    break;
                }
                break;
            case 17:
                gzs<s3q0> gzsVar = ((ToolBottomView) obj).d;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            default:
                com.vk.attachpicker.screen.p pVar = (com.vk.attachpicker.screen.p) obj;
                if (!pVar.s.get() && (L = pVar.L()) != null) {
                    if (!(L instanceof MediaStoreVideoEntry)) {
                        com.vk.attachpicker.screen.t tVar = pVar.S;
                        com.vk.attachpicker.b bVar = pVar.G;
                        MediaStoreEntry l = bVar.l(L);
                        if (l == null) {
                            l = L;
                        }
                        Object g2 = bVar.g(L);
                        r4p r4pVar = g2 instanceof r4p ? (r4p) g2 : null;
                        zlw zlwVar = new zlw(l);
                        if (h.a.a(new g4p(zlwVar.a()))) {
                            com.vk.attachpicker.screen.s sVar = new com.vk.attachpicker.screen.s(pVar, l);
                            pVar.b0 = true;
                            l5a0.c = new l5a0.a();
                            Activity activity2 = pVar.k;
                            if (activity2 == null || activity2.getResources().getConfiguration().orientation != 2) {
                                ?? r2 = pVar.U;
                                com.vk.attachpicker.screen.p pVar2 = r2 != 0 ? r2 : pVar;
                                activity2.setRequestedOrientation(1);
                                r4p r4pVar2 = r4pVar;
                                boolean z = pVar.L;
                                com.vk.core.simplescreen.a aVar4 = pVar.z;
                                c6a0 c6a0Var = pVar.f0;
                                com.vk.attachpicker.screen.h hVar = new com.vk.attachpicker.screen.h(zlwVar, r4pVar2, sVar, pVar2, z, aVar4, c6a0Var != null ? c6a0Var.a() : null, null, tVar.N(), pVar.e0);
                                tVar.u(pVar.z);
                                ScreenContainer screenContainer = pVar.f;
                                if (screenContainer != null) {
                                    screenContainer.d(hVar);
                                }
                            } else {
                                ?? r22 = pVar.U;
                                new n3u0(pVar, activity2, zlwVar, r4pVar, sVar, r22 != 0 ? r22 : pVar).enable();
                                activity2.setRequestedOrientation(1);
                            }
                        } else {
                            cvk.u(R.string.picker_image_format_invalid, false);
                        }
                        GalleryFragmentImpl.g gVar = pVar.Y;
                        if (gVar != null) {
                            gVar.b.B0 = L;
                            break;
                        }
                    } else {
                        p870.f().c(2);
                        pVar.R(new eo1(8, pVar, L));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ yn3(zs90 zs90Var, xs90 xs90Var) {
        this.b = 14;
        this.c = zs90Var;
    }
}
