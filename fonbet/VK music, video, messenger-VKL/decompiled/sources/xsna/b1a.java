package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.Ad;
import com.vk.api.base.Document;
import com.vk.clips.design.view.filter.HslView;
import com.vk.clips.design.view.hsl.HslRecyclerView;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dto.common.Good;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import com.vk.editor.filters.correction.entity.HslColorType;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.HeaderTitle;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.imageloader.view.VKImageView;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.DonutSettingsDialogConfig;
import com.vk.newsfeed.impl.fragments.PostPreviewFragment;
import com.vk.permission.PermissionHelper;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.pushes.receivers.c;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.voip.ui.asr.ui.list.PastAsrListFragment;
import com.vk.voip.ui.asr.ui.list.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import xsna.f0r;
import xsna.gm50;
import xsna.kkd;
import xsna.s1c0;
import xsna.t5e;
import xsna.wbu0;
import xsna.wk50;
import xsna.zjh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class b1a implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b1a(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0181, code lost:
    
        if (r3 != null) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f5  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Owner owner;
        Owner d;
        Owner d2;
        String str;
        String str2;
        Photo photo;
        String str3;
        VKImageView vKImageView;
        String string;
        SpannableString spannableString;
        Integer valueOf;
        TextView textView;
        String string2;
        Resources resources;
        UserId userId;
        Post R;
        int i = 2;
        int i2 = 3;
        switch (this.b) {
            case 0:
                q3a q3aVar = (q3a) this.c;
                c1a c1aVar = (c1a) this.d;
                Boolean bool = (Boolean) obj;
                q3aVar.b(new buz(12, new na7(i2, c1aVar, bool), new cx(i, bool, c1aVar)), false);
                break;
            case 1:
                ((izs) this.d).invoke(ChannelMsgSendConfig.a((ChannelMsgSendConfig) this.c, (Date) obj, false, false, false, false, null, null, null, null, false, false, false, false, null, 32766));
                break;
            case 2:
                break;
            case 3:
                gwc gwcVar = (gwc) this.c;
                SdkVideoFile sdkVideoFile = (SdkVideoFile) this.d;
                gwcVar.j(sdkVideoFile.r1());
                nme.a(MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem.EventSubtype.AUTHOR, SchemeStat$TypeClipViewerItem.EventType.UNHIDE, fzc.b(gwcVar.e.a), sdkVideoFile);
                ((ikv0) obj).a();
                break;
            case 4:
                kkd kkdVar = (kkd) this.c;
                gzs gzsVar = (gzs) this.d;
                kkd.a aVar = kkdVar.a;
                aVar.c.b(aVar.a, ((ModalActionSheetListItem) obj).a);
                gzsVar.invoke();
                break;
            case 5:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) this.c;
                ClipsFavoriteFolderContentListFragment.b bVar = (ClipsFavoriteFolderContentListFragment.b) this.d;
                ClipsFavoriteFolderContentListViewState.h hVar = (ClipsFavoriteFolderContentListViewState.h) obj;
                int i3 = ClipsFavoriteFolderContentListFragment.W;
                int i4 = 21;
                gm50.a.a(clipsFavoriteFolderContentListFragment, hVar.a, new vs(bVar, i4));
                gm50.a.a(clipsFavoriteFolderContentListFragment, hVar.b, new com.vk.movika.sdk.base.logic.interactor.p(clipsFavoriteFolderContentListFragment, i4));
                break;
            case 6:
                ((h5e) this.c).b.d(new t5e.e(((List) this.d).size()), null);
                break;
            case 7:
                ((zjh) this.c).f.invoke(((zjh.c) this.d).m);
                break;
            case 8:
                xak xakVar = (xak) this.c;
                Context context = xakVar.b;
                String str4 = (String) this.d;
                Throwable th = ((vgg) obj).a;
                if (str4.length() > 1) {
                    wbu0.a a = wbu0.a(context, th, false);
                    qak qakVar = xakVar.D;
                    String str5 = a.a;
                    if (str5 == null || drm0.N(str5)) {
                        str5 = context.getString(R.string.vk_auth_create_email_error_email_busy);
                    }
                    xakVar.A0(qak.a(qakVar, false, str5, false, 5));
                }
                par0.a.getClass();
                par0.d(th);
                break;
            case 9:
                qgi0.h((tgi0) obj, ((String) this.c) + ", " + ((String) this.d));
                break;
            case 10:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) this.c;
                io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new ekl((fkl) this.d, r7));
                asu0.a.getClass();
                io.reactivex.rxjava3.internal.operators.single.f0 q = vVar.q(asu0.m());
                int i5 = kwg0.a;
                basePhotoListFragment.fo(q.subscribe(new iwg0(), new vl0(new l3f(com.vk.metrics.eventtracking.b.a, 4), 17)));
                break;
            case 11:
                asm asmVar = (asm) this.c;
                DialogExt dialogExt = (DialogExt) this.d;
                Context context2 = asmVar.a;
                a1w a1wVar = asmVar.b;
                a1wVar.getClass();
                lqb.a(context2, new jl4(7, asmVar, dialogExt), a1wVar.r().h.x());
                break;
            case 12:
                break;
            case 13:
                x0n x0nVar = (x0n) this.c;
                RecyclerView recyclerView = (RecyclerView) this.d;
                Drawable[] drawableArr = (Drawable[]) obj;
                h1n h1nVar = x0nVar.b;
                Drawable drawable = drawableArr[0];
                Drawable drawable2 = drawableArr[1];
                Drawable drawable3 = drawableArr[2];
                Drawable drawable4 = drawableArr[3];
                Drawable drawable5 = drawableArr[4];
                h1nVar.d = drawable;
                h1nVar.e = drawable2;
                h1nVar.f = drawable3;
                h1nVar.g = drawable4;
                h1nVar.h = drawable5;
                recyclerView.invalidateItemDecorations();
                break;
            case 14:
                Uri uri = (Uri) this.c;
                Activity activity = (Activity) this.d;
                Document document = (Document) obj;
                if (epx.f(document.m, "pdf")) {
                    com.vk.movika.sdk.android.defaultplayer.interactive.a aVar2 = null;
                    evn evnVar = new evn(activity, uri, aVar2, document.l, document.m);
                    ma maVar = new ma(11, activity, aVar2);
                    if (gz80.a(34)) {
                        evnVar.invoke();
                    } else {
                        PermissionHelper permissionHelper = PermissionHelper.a;
                        permissionHelper.getClass();
                        permissionHelper.d(activity, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, evnVar, maVar);
                    }
                } else {
                    rp1 rp1Var = new rp1(9, document, activity);
                    if (gz80.a(34)) {
                        rp1Var.invoke();
                    } else {
                        PermissionHelper permissionHelper2 = PermissionHelper.a;
                        permissionHelper2.getClass();
                        permissionHelper2.d(activity, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, rp1Var, null);
                    }
                }
                break;
            case 15:
                emc0 emc0Var = (emc0) this.c;
                r2o r2oVar = (r2o) this.d;
                emc0Var.a(DonutSettingsDialogConfig.Mode.All);
                dw20 dw20Var = r2oVar.k;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                break;
            case 16:
                break;
            case 17:
                ((f0r.h) this.c).h((wk50.a) this.d, (Throwable) obj);
                break;
            case 18:
                h0s h0sVar = (h0s) this.c;
                FolderType folderType = (FolderType) this.d;
                Boolean bool2 = (Boolean) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Folders", h0sVar.hashCode() + " is folder presented " + folderType + ' ' + bool2});
                }
                break;
            case 19:
                HslView hslView = (HslView) this.c;
                wgv wgvVar = (wgv) this.d;
                float floatValue = ((Float) obj).floatValue();
                HslRecyclerView hslRecyclerView = hslView.t;
                HslColorType hslColorType = wgvVar.a;
                ugv ugvVar = hslRecyclerView.c;
                final t3h t3hVar = new t3h(hslColorType, 25);
                wgv wgvVar2 = (wgv) ((ListDataSet) ugvVar.c).t(new Predicate() { // from class: xsna.zgv
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        int i6 = HslRecyclerView.e;
                        return ((Boolean) t3h.this.invoke(obj2)).booleanValue();
                    }
                });
                if (wgvVar2 != null) {
                    wgvVar2.e = floatValue;
                }
                izs<? super wgv, s3q0> izsVar = hslView.x;
                if (izsVar != null) {
                    izsVar.invoke(wgvVar);
                }
                break;
            case 20:
                com.vk.ecomm.catalog.impl.catalog.simple.a aVar3 = (com.vk.ecomm.catalog.impl.catalog.simple.a) this.c;
                aVar3.j.b(new dy00((UserId) this.d));
                dw20 dw20Var2 = aVar3.l;
                if (dw20Var2 != null) {
                    dw20Var2.dismiss();
                }
                break;
            case 21:
                gw00 gw00Var = (gw00) this.c;
                Good good = (Good) this.d;
                gw00Var.f.b.b.d.j(new vu00(good.c, good.b, ((Integer) obj).intValue()));
                break;
            case 22:
                nk40 nk40Var = (nk40) this.c;
                Playlist playlist = (Playlist) this.d;
                nk40Var.getClass();
                break;
            case 23:
                Context context3 = (Context) this.c;
                Intent intent = (Intent) this.d;
                z4g.d().l();
                c.a aVar4 = com.vk.pushes.receivers.c.b;
                c.a.f(context3, intent, true);
                break;
            case 24:
                kr70 kr70Var = (kr70) this.c;
                NewsComment newsComment = (NewsComment) this.d;
                vqt vqtVar = (vqt) obj;
                ListDataSet<cbg> listDataSet = kr70Var.a;
                VKList<NewsComment> vKList = vqtVar.a;
                if (vKList.isEmpty()) {
                    int b = kr70Var.b(newsComment);
                    if (b > 0) {
                        listDataSet.A(b);
                    }
                } else {
                    g5g.D(vKList, true, new pj1(newsComment, 10));
                    CommentThread commentThread = newsComment.L;
                    CommentThread commentThread2 = commentThread != null ? new CommentThread(commentThread.b, commentThread.c, commentThread.d, commentThread.e, new ArrayList(commentThread.f), commentThread.g, commentThread.h, commentThread.i, commentThread.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
                    commentThread2.f.addAll(vKList);
                    newsComment.L = commentThread2;
                    ArrayList c = dbg.c(kr70Var.b, newsComment, vqtVar.a);
                    cbg cbgVar = (cbg) j5g.a0(c);
                    if (cbgVar != null) {
                        int a2 = kr70Var.a(cbgVar.b);
                        if (a2 != -1) {
                            cbg c2 = listDataSet.c(a2);
                            iag iagVar = c2 != null ? c2.b : null;
                            int size = c.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                cbg cbgVar2 = (cbg) j5g.b0(i6, c);
                                if (cbgVar2 != null) {
                                    cbgVar2.b = iagVar;
                                }
                            }
                            while (a2 > 0 && c2 != null && c2.b == cbgVar.b && c2.a.getId() > cbgVar.a.getId()) {
                                a2--;
                                c2 = listDataSet.c(a2);
                            }
                            listDataSet.y(a2 + 1, c);
                        } else {
                            listDataSet.n0(c);
                        }
                    }
                    int b2 = kr70Var.b(newsComment);
                    if (b2 > 0) {
                        listDataSet.c(b2).d = Boolean.FALSE;
                        int f4 = newsComment.f4();
                        CommentThread commentThread3 = newsComment.L;
                        if (f4 > (commentThread3 != null ? commentThread3.f.size() : 0)) {
                            listDataSet.d(b2);
                        } else {
                            listDataSet.A(b2);
                        }
                    }
                }
                break;
            case 25:
                PastAsrListFragment pastAsrListFragment = (PastAsrListFragment) this.c;
                PastAsrListFragment.b bVar2 = (PastAsrListFragment.b) this.d;
                int i7 = PastAsrListFragment.U;
                pastAsrListFragment.fo((a.c) obj, bVar2);
                break;
            case 26:
                ((sgb0) this.c).b.h((hyg0) obj, (ugb0) this.d);
                break;
            case 27:
                u6c0 u6c0Var = (u6c0) this.c;
                s6c0 s6c0Var = (s6c0) this.d;
                v6c0 v6c0Var = (v6c0) obj;
                NewsEntry newsEntry = v6c0Var.a;
                Group group = v6c0Var.c;
                if (newsEntry != null && (R = di60.R(newsEntry)) != null && !R.pc()) {
                    ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
                    jt50.a(SingleEvent.POST);
                }
                boolean z = s6c0Var.b;
                boolean z2 = s6c0Var.c;
                u6c0Var.getClass();
                PostPreviewFragment postPreviewFragment = u6c0Var.a;
                m6r0 a3 = hd60.a().a();
                if (z && z2) {
                    if (group == null || (userId = group.c) == null) {
                        userId = UserId.d;
                    }
                    owner = new Owner(fkq0.e(userId), group != null ? group.d : null, group != null ? group.f : null, group != null ? group.e : null, group != null ? group.y : null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194272, null);
                } else {
                    Owner owner2 = new Owner(a3.y(), a3.r(), null, a3.u(), a3.z(), null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194272, null);
                    owner2.B(a3.e(m6r0.s1));
                    owner = owner2;
                }
                u6c0Var.c = owner;
                UserProfile userProfile = v6c0Var.d;
                if (newsEntry == null) {
                    u6c0.a(u6c0Var, 3);
                } else {
                    u6c0.a(u6c0Var, 6);
                    ApiApplication apiApplication = v6c0Var.b;
                    if (apiApplication != null) {
                        if (z) {
                            if (group != null) {
                                str = group.d;
                                if (str == null) {
                                    str = "";
                                }
                                str2 = apiApplication.c;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                photo = apiApplication.d;
                                if (photo != null) {
                                    FragmentActivity activity2 = postPreviewFragment.getActivity();
                                    ImageSize Fb = photo.Fb((activity2 == null || (resources = activity2.getResources()) == null) ? 0 : resources.getDimensionPixelSize(R.dimen.newsfeed_post_preview_app_avatar_size), false);
                                    if (Fb != null) {
                                        str3 = Fb.d.d;
                                        break;
                                    }
                                }
                                str3 = "";
                                boolean f = epx.f(a3.y(), userProfile == null ? userProfile.c : null);
                                vKImageView = postPreviewFragment.X;
                                if (vKImageView != null) {
                                    vKImageView.load(str3);
                                }
                                if (!z) {
                                    FragmentActivity activity3 = postPreviewFragment.getActivity();
                                    if (activity3 != null) {
                                        string = activity3.getString(R.string.postpreview_title_community_wall, str2, str);
                                        spannableString = new SpannableString(string);
                                        FragmentActivity activity4 = postPreviewFragment.getActivity();
                                        String string3 = activity4 == null ? activity4.getString(R.string.postpreview_title_community_wall) : null;
                                        valueOf = string3 == null ? Integer.valueOf(drm0.K(0, 6, string3, "%1$s", false)) : null;
                                        if (valueOf != null && valueOf.intValue() >= 0) {
                                            spannableString.setSpan(new StyleSpan(1), valueOf.intValue(), str2.length() + valueOf.intValue(), 33);
                                        }
                                        if (!f) {
                                            int i8 = z ? R.string.postpreview_title_community_wall : R.string.postpreview_title_user_wall;
                                            FragmentActivity activity5 = postPreviewFragment.getActivity();
                                            if (activity5 != null && (string2 = activity5.getString(i8)) != null) {
                                                int length = str2.length() + (drm0.O(0, 6, string2, "%2$s") - 4);
                                                spannableString.setSpan(new StyleSpan(1), length, str.length() + length, 33);
                                            }
                                        }
                                        textView = postPreviewFragment.Y;
                                        if (textView != null) {
                                            textView.setText(spannableString);
                                        }
                                    }
                                    string = null;
                                    spannableString = new SpannableString(string);
                                    FragmentActivity activity42 = postPreviewFragment.getActivity();
                                    if (activity42 == null) {
                                    }
                                    if (string3 == null) {
                                    }
                                    if (valueOf != null) {
                                        spannableString.setSpan(new StyleSpan(1), valueOf.intValue(), str2.length() + valueOf.intValue(), 33);
                                    }
                                    if (!f) {
                                    }
                                    textView = postPreviewFragment.Y;
                                    if (textView != null) {
                                    }
                                } else if (f) {
                                    FragmentActivity activity6 = postPreviewFragment.getActivity();
                                    if (activity6 != null) {
                                        string = activity6.getString(R.string.postpreview_title_author_wall, str2);
                                        spannableString = new SpannableString(string);
                                        FragmentActivity activity422 = postPreviewFragment.getActivity();
                                        if (activity422 == null) {
                                        }
                                        if (string3 == null) {
                                        }
                                        if (valueOf != null) {
                                        }
                                        if (!f) {
                                        }
                                        textView = postPreviewFragment.Y;
                                        if (textView != null) {
                                        }
                                    }
                                    string = null;
                                    spannableString = new SpannableString(string);
                                    FragmentActivity activity4222 = postPreviewFragment.getActivity();
                                    if (activity4222 == null) {
                                    }
                                    if (string3 == null) {
                                    }
                                    if (valueOf != null) {
                                    }
                                    if (!f) {
                                    }
                                    textView = postPreviewFragment.Y;
                                    if (textView != null) {
                                    }
                                } else {
                                    FragmentActivity activity7 = postPreviewFragment.getActivity();
                                    if (activity7 != null) {
                                        string = activity7.getString(R.string.postpreview_title_user_wall, str2, str);
                                        spannableString = new SpannableString(string);
                                        FragmentActivity activity42222 = postPreviewFragment.getActivity();
                                        if (activity42222 == null) {
                                        }
                                        if (string3 == null) {
                                        }
                                        if (valueOf != null) {
                                        }
                                        if (!f) {
                                        }
                                        textView = postPreviewFragment.Y;
                                        if (textView != null) {
                                        }
                                    }
                                    string = null;
                                    spannableString = new SpannableString(string);
                                    FragmentActivity activity422222 = postPreviewFragment.getActivity();
                                    if (activity422222 == null) {
                                    }
                                    if (string3 == null) {
                                    }
                                    if (valueOf != null) {
                                    }
                                    if (!f) {
                                    }
                                    textView = postPreviewFragment.Y;
                                    if (textView != null) {
                                    }
                                }
                            }
                            str = null;
                            if (str == null) {
                            }
                            str2 = apiApplication.c;
                            if (str2 == null) {
                            }
                            photo = apiApplication.d;
                            if (photo != null) {
                            }
                            str3 = "";
                            boolean f2 = epx.f(a3.y(), userProfile == null ? userProfile.c : null);
                            vKImageView = postPreviewFragment.X;
                            if (vKImageView != null) {
                            }
                            if (!z) {
                            }
                        } else {
                            if (userProfile != null) {
                                str = userProfile.e;
                                if (str == null) {
                                }
                                str2 = apiApplication.c;
                                if (str2 == null) {
                                }
                                photo = apiApplication.d;
                                if (photo != null) {
                                }
                                str3 = "";
                                boolean f22 = epx.f(a3.y(), userProfile == null ? userProfile.c : null);
                                vKImageView = postPreviewFragment.X;
                                if (vKImageView != null) {
                                }
                                if (!z) {
                                }
                            }
                            str = null;
                            if (str == null) {
                            }
                            str2 = apiApplication.c;
                            if (str2 == null) {
                            }
                            photo = apiApplication.d;
                            if (photo != null) {
                            }
                            str3 = "";
                            boolean f222 = epx.f(a3.y(), userProfile == null ? userProfile.c : null);
                            vKImageView = postPreviewFragment.X;
                            if (vKImageView != null) {
                            }
                            if (!z) {
                            }
                        }
                    }
                    if (newsEntry instanceof Post) {
                        Post post = (Post) newsEntry;
                        Owner owner3 = u6c0Var.c;
                        if (owner3 != null) {
                            post.o.u(owner3);
                            EntryHeader entryHeader = post.y;
                            SourcePhoto sourcePhoto = entryHeader != null ? entryHeader.b : null;
                            if (epx.f((sourcePhoto == null || (d2 = sourcePhoto.d()) == null) ? null : d2.b, owner3.b) && (d = sourcePhoto.d()) != null) {
                                d.u(owner3);
                            }
                            EntryHeader entryHeader2 = post.y;
                            HeaderTitle headerTitle = entryHeader2 != null ? entryHeader2.c : null;
                            if (epx.f(headerTitle != null ? headerTitle.d() : null, owner3.b)) {
                                List<Text> list = headerTitle.c;
                                Text text = list != null ? (Text) j5g.a0(list) : null;
                                if (text != null) {
                                    text.b = owner3.c;
                                }
                            }
                        }
                        post.l.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH, true);
                        s1c0.a aVar5 = new s1c0.a();
                        aVar5.k = true;
                        ArrayList g = com.vk.newsfeed.common.util.j.g(u6c0Var.i, post, aVar5.a(), "", Ad.d);
                        b2c0 b2c0Var = postPreviewFragment.T;
                        if (b2c0Var != null) {
                            b2c0Var.n0(g);
                        }
                        postPreviewFragment.jo(true);
                    }
                }
                break;
            case 28:
                yid0 yid0Var = (yid0) this.c;
                Context context4 = (Context) this.d;
                Throwable th2 = (Throwable) obj;
                L.i(th2);
                if (!yid0Var.f.a(context4, th2)) {
                    enj.q(R.string.product_error_change_amount, 0, vx2.d.getContext());
                }
                break;
            default:
                Iterator<f360> it = ((r9e0) this.c).d.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ b1a(com.vk.ecomm.catalog.impl.catalog.simple.a aVar, int i, UserId userId) {
        this.b = 20;
        this.c = aVar;
        this.d = userId;
    }

    public /* synthetic */ b1a(ChannelMsgSendConfig channelMsgSendConfig, izs izsVar, zbb zbbVar) {
        this.b = 1;
        this.c = channelMsgSendConfig;
        this.d = izsVar;
    }
}
