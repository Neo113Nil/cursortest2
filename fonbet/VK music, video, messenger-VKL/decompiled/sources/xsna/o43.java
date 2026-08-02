package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.account.dto.AccountPushSettingsDto;
import com.vk.api.generated.superApp.dto.SuperAppMiniWidgetItemDto;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.common.Source;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.dto.photo.Photo;
import com.vk.dto.profile.CommunityInternalMenu$Companion$MenuItemType;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.ecomm.reviews.impl.allreviews.presentation.a;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.im.engine.models.groups.ManagedGroup;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.photos.root.archive.presentation.view.ArchiveRecyclerPaginatedView;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vk.superapp.location.js.bridge.api.events.GetGeodata$Parameters;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import com.vk.upload.impl.UploadNotification;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.aw9;
import xsna.e8v0;
import xsna.g6c;
import xsna.it80;
import xsna.kjw;
import xsna.kpk;
import xsna.lpe0;
import xsna.lr20;
import xsna.mk50;
import xsna.p9k;
import xsna.r2c;
import xsna.s2s;
import xsna.uu1;
import xsna.xrh;
import xsna.z4h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class o43 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o43(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        RecyclerView.e0 findViewHolderForLayoutPosition;
        int i = this.b;
        int i2 = 2;
        int i3 = 0;
        int i4 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                StoryViewAction storyViewAction = (StoryViewAction) obj2;
                b.d dVar = (b.d) obj;
                if (((w43) obj3).p1()) {
                    zwl0.a(dVar, storyViewAction);
                }
                return s3q0.a;
            case 1:
                op20 op20Var = (op20) obj3;
                ApiApplication apiApplication = (ApiApplication) obj2;
                Context context = op20Var.b;
                Activity h = e3m.h(context);
                op20Var.c.a = (String) obj;
                iq20 iq20Var = op20Var.d;
                String str = iq20Var.a;
                if (str != null && str.length() != 0) {
                    apiApplication.B = iq20Var.a;
                }
                if (apiApplication.K && h != null) {
                    com.vk.common.links.c.K(op20Var);
                    return s3q0.a;
                }
                oz50 d = bis.d(op20Var);
                if (h == null) {
                    d.k(context);
                    return s3q0.a;
                }
                aq20 aq20Var = op20Var.e;
                boolean z = aq20Var.i;
                Integer num = aq20Var.e;
                if (z) {
                    hf3.e(h, op20Var, null);
                } else if (aq20Var.h) {
                    Intent n = d.n(context);
                    if (num == null || !(h instanceof aeg0)) {
                        context.startActivity(n);
                    } else {
                        h.startActivityForResult(n, num.intValue());
                    }
                } else if (num == null || !(h instanceof aeg0)) {
                    d.k(context);
                } else {
                    d.h(h, num.intValue());
                }
                return s3q0.a;
            case 2:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                nj3 nj3Var = (nj3) obj2;
                TextView textView = nj3Var.j;
                List list = (List) obj;
                if (list != null) {
                    if (ref$BooleanRef.element) {
                        int i5 = 0;
                        for (Object obj4 : list) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                e43.t();
                                throw null;
                            }
                            nj3Var.k.y(i5, epx.f(((y7a0) obj4).b, Boolean.TRUE));
                            i5 = i6;
                        }
                        ref$BooleanRef.element = false;
                    }
                    ArchiveRecyclerPaginatedView archiveRecyclerPaginatedView = nj3Var.h;
                    bwt0.p0(textView, !list.isEmpty());
                    if (list.isEmpty()) {
                        archiveRecyclerPaginatedView.p(2, archiveRecyclerPaginatedView.d, archiveRecyclerPaginatedView.e, archiveRecyclerPaginatedView.c, archiveRecyclerPaginatedView.b);
                    } else {
                        archiveRecyclerPaginatedView.f0();
                    }
                    nj3Var.m.submitList(list);
                } else {
                    bwt0.p0(textView, false);
                }
                return s3q0.a;
            case 3:
                a24 a24Var = (a24) obj3;
                a24Var.a = true;
                a24Var.c.a((VkOnboardingCampaign) obj2, VkOnboardingType.Tooltip, e8v0.m.b);
                return s3q0.a;
            case 4:
                Context context2 = (Context) obj2;
                izs<? super lpe0, s3q0> izsVar = ((pb6) obj3).t;
                if (izsVar != null) {
                    izsVar.invoke(lpe0.a.a);
                }
                mhy.b(context2);
                return s3q0.a;
            case 5:
                fi6 fi6Var = (fi6) obj3;
                ViewGroup viewGroup = (ViewGroup) obj2;
                View view = (View) obj;
                int i7 = fi6Var.c.a;
                View l = awt0.l(viewGroup, new da6(i7, i4));
                if (l == null) {
                    l = viewGroup.findViewById(i7);
                }
                fi6Var.P(l, view);
                int indexOfChild = viewGroup.indexOfChild(l);
                viewGroup.removeViewAt(indexOfChild);
                viewGroup.addView(view, indexOfChild);
                fi6Var.Q(view);
                fi6Var.e.onNext(new mk50.c(view));
                return s3q0.a;
            case 6:
                laa laaVar = (laa) obj3;
                String str2 = (String) obj2;
                List list2 = (List) obj;
                switch (str2.hashCode()) {
                    case -1581161142:
                        if (str2.equals("offline_music_replacement_artist")) {
                            return j5g.D0(new aaa(i4), list2);
                        }
                        break;
                    case -1529764530:
                        if (str2.equals("offline_music_replacement_name")) {
                            return j5g.D0(new taa(i3), list2);
                        }
                        break;
                    case -350924078:
                        if (str2.equals("offline_music_replacement_date_new")) {
                            return j5g.D0(new nd3(i2), list2);
                        }
                        break;
                    case -350922919:
                        if (str2.equals("offline_music_replacement_date_old")) {
                            return j5g.D0(new ek0(i2), list2);
                        }
                        break;
                    case -185433675:
                        if (str2.equals("offline_music_replacement_old_first")) {
                            return j5g.y0(list2);
                        }
                        break;
                    case 505811102:
                        if (str2.equals("offline_music_replacement_default")) {
                            return ((Boolean) laaVar.l.getValue()).booleanValue() ? j5g.D0(new baa(i4), list2) : list2;
                        }
                        break;
                    case 1989951086:
                        if (str2.equals("offline_music_replacement_new_first")) {
                            return list2;
                        }
                        break;
                }
                throw new IllegalArgumentException("Unknown replacement = ".concat(str2));
            case 7:
                z4c z4cVar = (z4c) obj3;
                r2c.n nVar = (r2c.n) obj2;
                Throwable th = (Throwable) obj;
                z4cVar.T(aw9.a.C2577a.b);
                u8k0 a = l4c.a(th);
                if (a != null) {
                    z4cVar.g.b(new g6c.m(a));
                } else {
                    z4cVar.c0(th, nVar);
                }
                return s3q0.a;
            case 8:
                ((nad) obj3).V0("");
                j03.j((Context) obj2, (Throwable) obj);
                return s3q0.a;
            case 9:
                SdkClipVideoFile sdkClipVideoFile = (SdkClipVideoFile) obj2;
                izs<? super SdkVideoFile, s3q0> izsVar2 = ((xle) obj3).g;
                if (izsVar2 != null) {
                    izsVar2.invoke(sdkClipVideoFile);
                }
                return s3q0.a;
            case 10:
                ClipsVideoAttachmentPickerFragment clipsVideoAttachmentPickerFragment = (ClipsVideoAttachmentPickerFragment) obj3;
                ClipsVideoAttachmentPickerFragment.b bVar = (ClipsVideoAttachmentPickerFragment.b) obj2;
                String str3 = (String) obj;
                int i8 = ClipsVideoAttachmentPickerFragment.W;
                bVar.a.setMiddle(clipsVideoAttachmentPickerFragment.V ? new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(tlo0.Companion, str3), null, null, null, null, 24), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14) : new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(tlo0.Companion, str3), new kg(9, clipsVideoAttachmentPickerFragment, bVar), new VkTopBar.Middle.Text.Title.a.C0870a(null), null, null, 24), null, null, null, 14));
                return s3q0.a;
            case 11:
                n2k0 n2k0Var = (n2k0) obj2;
                d2g d2gVar = (d2g) obj;
                wzs<? super n2k0, ? super d2g, s3q0> wzsVar = ((l1g) obj3).c;
                if (wzsVar != null) {
                    wzsVar.invoke(n2k0Var, d2gVar);
                }
                return s3q0.a;
            case 12:
                ((yyg) obj3).V((Throwable) obj, (fzg) obj2);
                return s3q0.a;
            case 13:
                d5h d5hVar = (d5h) obj3;
                o5h o5hVar = d5hVar.l;
                xrh.c.b bVar2 = (xrh.c.b) obj2;
                RecyclerView recyclerView = (RecyclerView) ((View) obj);
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null) {
                    return s3q0.a;
                }
                int s = linearLayoutManager.s();
                int w = linearLayoutManager.w();
                if (s == -1 || w == -1 || w >= o5hVar.b.size()) {
                    return s3q0.a;
                }
                j9x it = new k9x(s, w, 1).iterator();
                while (true) {
                    if (it.d) {
                        Object next = it.next();
                        if (((z4h.a) o5hVar.b.get(((Number) next).intValue())).g != CommunityInternalMenu$Companion$MenuItemType.ADMIN_GEAR) {
                            r6 = next;
                        }
                    }
                }
                Integer num2 = (Integer) r6;
                if (num2 != null && (findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(num2.intValue())) != null) {
                    recyclerView.post(new c5h(d5hVar, findViewHolderForLayoutPosition, bVar2, i3));
                }
                return s3q0.a;
            case 14:
                return new tij0((ViewGroup) obj, ((Boolean) ((com.vk.movika.sdk.base.logic.interactor.h) obj3).invoke()).booleanValue(), new com.vk.movika.tools.controls.seekbar.l((fyh) obj2, 5), cn70.b(16));
            case 15:
                RectF rectF = (RectF) obj3;
                h1k h1kVar = (h1k) obj2;
                Pair pair = (Pair) obj;
                Bitmap bitmap = (Bitmap) pair.d();
                kjw.a aVar = (kjw.a) pair.g();
                if (rectF.width() * aVar.a < 960.0f || rectF.height() * aVar.b < 384.0f) {
                    return io.reactivex.rxjava3.core.q.H(new Throwable());
                }
                nr2 nr2Var = h1kVar.a;
                return io.reactivex.rxjava3.core.q.T(Bitmap.createBitmap(bitmap, (int) (rectF.left * bitmap.getWidth()), (int) (rectF.top * bitmap.getHeight()), (int) (rectF.width() * bitmap.getWidth()), (int) (rectF.height() * bitmap.getHeight())));
            case 16:
                p9k p9kVar = (p9k) obj3;
                io.reactivex.rxjava3.internal.operators.single.r rVar = (io.reactivex.rxjava3.internal.operators.single.r) obj2;
                p9k.b bVar3 = (p9k.b) obj;
                if (bVar3 instanceof p9k.b.C3500b) {
                    return p9kVar.a.C(rVar, new abj(Collections.singletonList(Long.valueOf(((p9k.b.C3500b) bVar3).a)), Source.ACTUAL, false, null)).l(new j7(new qt(22), 18));
                }
                if (epx.f(bVar3, p9k.b.a.a)) {
                    return tr.b(it80.b);
                }
                if (!(bVar3 instanceof p9k.b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                it80.a aVar2 = it80.b;
                com.vk.im.engine.models.contacts.a aVar3 = new com.vk.im.engine.models.contacts.a(((p9k.b.c) bVar3).a);
                aVar2.getClass();
                return io.reactivex.rxjava3.core.x.k(new it80(aVar3));
            case 17:
                kpk kpkVar = (kpk) obj3;
                io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) obj2;
                UploadNotification.b bVar4 = (UploadNotification.b) obj;
                int i9 = kpk.b.$EnumSwitchMapping$0[bVar4.b.ordinal()];
                if (i9 == 1) {
                    Parcelable parcelable = bVar4.e;
                    Photo photo = parcelable instanceof Photo ? (Photo) parcelable : null;
                    if (photo == null) {
                        yVar.onSuccess(new kpk.a.b(new IllegalStateException("Null photo after upload")));
                    } else {
                        ReentrantLock reentrantLock = kpkVar.d;
                        reentrantLock.lock();
                        try {
                            kpkVar.e.add(0, photo);
                            ArrayList a2 = kpkVar.a(kpkVar.e);
                            int i10 = kpkVar.c.b.getInt(fpk.b(photo.c), 0);
                            kpkVar.f.onNext(a2);
                            Iterator it2 = a2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    if (((Mask) next2).d == i10) {
                                        r6 = next2;
                                    }
                                }
                            }
                            Mask mask = (Mask) r6;
                            reentrantLock.unlock();
                            if (mask == null) {
                                yVar.onSuccess(new kpk.a.b(new IllegalStateException("Null mask")));
                            } else {
                                yVar.onSuccess(new kpk.a.c(mask));
                            }
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                } else if (i9 == 2) {
                    Throwable th2 = bVar4.f;
                    if (th2 == null) {
                        th2 = new IOException("Image upload failed");
                    }
                    yVar.onSuccess(new kpk.a.b(th2));
                }
                return s3q0.a;
            case 18:
                io.reactivex.rxjava3.subjects.f<Boolean> fVar = ((com.vk.notifications.dnd.impl.a) obj3).b;
                Context context3 = (Context) obj2;
                if (((AccountPushSettingsDto) obj).d() == null) {
                    fVar.onNext(Boolean.FALSE);
                    return s3q0.a;
                }
                long intValue = r2.intValue() - (System.currentTimeMillis() / 1000);
                if (intValue < 0) {
                    intValue = 0;
                }
                if (intValue == 0) {
                    List<Long> list3 = lsn.a;
                    Preference.F(0L, "notifications_prefs", "dnd_end");
                    fVar.onNext(Boolean.FALSE);
                } else {
                    List<Long> list4 = lsn.a;
                    xuo0.a.getClass();
                    Preference.F(xuo0.a() + (intValue * 1000), "notifications_prefs", "dnd_end");
                    ca70 ca70Var = ca70.a;
                    sv1.C();
                    ca70.f(context3).cancelAll();
                    fVar.onNext(Boolean.TRUE);
                }
                return s3q0.a;
            case 19:
                ((mxo) obj3).g.a((UserId) obj2);
                return s3q0.a;
            case 20:
                htp htpVar = (htp) obj3;
                gzs gzsVar = (gzs) obj2;
                atp atpVar = htpVar.z;
                if (atpVar == null) {
                    return s3q0.a;
                }
                gzsVar.invoke();
                nr4.b().p(htpVar.itemView.getContext(), atpVar.b, atpVar.a());
                return s3q0.a;
            case 21:
                return t2q.e((t2q) obj3, (i9l0) obj2);
            case 22:
                c580 c580Var = (c580) obj3;
                i2s i2sVar = (i2s) obj2;
                t2s t2sVar = (t2s) obj;
                yyr yyrVar = t2sVar.c.get(Integer.valueOf(c580Var.b));
                if (yyrVar != null) {
                    i2sVar.n(new s2s.c(R.string.vkim_folder_edit_failed, yyrVar.getName()));
                }
                Set R0 = j5g.R0(t2sVar.f);
                R0.remove(Integer.valueOf(c580Var.b));
                return i2s.u(t2s.a(t2sVar, null, false, null, null, false, R0, null, false, 0, 479));
            case 23:
                jpv jpvVar = (jpv) obj3;
                ymy ymyVar = (ymy) obj2;
                int indexOf = jpvVar.c.indexOf(jpvVar.d);
                jpvVar.d = ymyVar;
                jpvVar.notifyItemChanged(jpvVar.c.indexOf(ymyVar));
                jpvVar.notifyItemChanged(indexOf);
                return s3q0.a;
            case 24:
                ((g5y) obj3).c().a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), ((GetGeodata$Parameters) obj2).c(), 1, null));
                return s3q0.a;
            case 25:
                Collection collection = (Collection) obj2;
                ((yi00) obj3).getClass();
                SQLiteStatement g = ((e0w) obj).g("REPLACE INTO managed_groups(id, title, type, access, avatar, avatar_is_nft, is_muted, unread_count, activity)\nVALUES (?,?,?,?,?,?,?,?,?)");
                try {
                    Iterator it3 = collection.iterator();
                    while (it3.hasNext()) {
                        yi00.k(g, (ManagedGroup) it3.next());
                        g.executeInsert();
                    }
                    s3q0 s3q0Var = s3q0.a;
                    g.close();
                    return s3q0.a;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        ro.e(g, th3);
                        throw th4;
                    }
                }
            case 26:
                a.j.C1007a c1007a = (a.j.C1007a) obj2;
                List<df10> list5 = ((ft00) obj3).h;
                ArrayList arrayList = new ArrayList(c5g.u(list5, 10));
                for (df10 df10Var : list5) {
                    if (epx.f(df10Var.d, c1007a.b)) {
                        df10Var = df10.a(df10Var, false, true, 524287);
                    }
                    arrayList.add(df10Var);
                }
                return new c.m(arrayList);
            case 27:
                ((com.vk.newsfeed.posting.market_picker.presentation.base.view.f) obj3).v.add(Integer.valueOf(((Photo) obj2).c));
                return s3q0.a;
            case 28:
                izs izsVar3 = (izs) obj3;
                uu1.a aVar4 = (uu1.a) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                MiniWidgetItem miniWidgetItem = aVar4.c;
                String g2 = miniWidgetItem.g();
                String str4 = aVar4.b;
                WebImageSize e = aVar4.a.e(cn70.b(40));
                r6 = e != null ? e.b : null;
                izsVar3.invoke(new lr20.a(g2, str4, r6 == null ? "" : r6, miniWidgetItem.getType(), epx.f(miniWidgetItem.getType(), SuperAppMiniWidgetItemDto.TypeDto.MW_BIRTHDAY.i()) ? MiniWidgetItem.HeaderIconAlign.BOTTOM : miniWidgetItem.f(), booleanValue));
                return s3q0.a;
            default:
                AttachGift attachGift = (AttachGift) obj2;
                pk30 pk30Var = ((wq30) obj3).u;
                if (pk30Var != null) {
                    pk30Var.k(attachGift);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ o43(izs izsVar, uu1.a aVar, qr20 qr20Var) {
        this.b = 28;
        this.c = izsVar;
        this.d = aVar;
    }
}
