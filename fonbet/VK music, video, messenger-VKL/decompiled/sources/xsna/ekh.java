package xsna;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.ui.mvp.holder.friends.FriendsCatalogRootVh;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.tabs.VkTabLayout;
import com.vk.core.view.components.tabs.d;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.music.PlaylistOwner;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.fragments.ImCreateChatFragment;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import com.vk.mediapicker.impl.presentation.fragment.MediaPickerFragment;
import com.vk.newsfeed.posting.impl.domain.model.LocalAlbum;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$MediaPicker$Album$SelectAlbum;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.i;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.SetBuilder;
import ru.ok.media.OkmpStreamer;
import xsna.drz;
import xsna.gm50;
import xsna.hil;
import xsna.inv;
import xsna.p4m;
import xsna.tj50;
import xsna.y410;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ekh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ekh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean f;
        s3q0 createPublisher$lambda$13;
        int i = this.b;
        int i2 = 10;
        int i3 = 9;
        int i4 = 13;
        int i5 = 2;
        int i6 = 3;
        int i7 = 6;
        int i8 = 1;
        int i9 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                fkh fkhVar = (fkh) obj2;
                nda0 nda0Var = (nda0) obj;
                if (nda0Var instanceof s4a0) {
                    f = epx.f(((s4a0) nda0Var).b.e, fkhVar.a);
                } else {
                    if (!(nda0Var instanceof zaa0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = epx.f(((zaa0) nda0Var).c, fkhVar.a);
                }
                return Boolean.valueOf(f);
            case 1:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj2;
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
                try {
                    ArrayList arrayList = new ArrayList(rawQuery.getCount());
                    if (rawQuery.moveToFirst()) {
                        while (!rawQuery.isAfterLast()) {
                            arrayList.add(rawQuery.getString(0));
                            rawQuery.moveToNext();
                        }
                    }
                    rawQuery.close();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        String str = (String) next;
                        if (!epx.f(str, "android_metadata") && !epx.f(str, "sqlite_sequence")) {
                            arrayList2.add(next);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) it2.next()));
                    }
                    return s3q0.a;
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            case 2:
                ((hv10) obj).j((ur4) obj2);
                return s3q0.a;
            case 3:
                View view = (View) obj;
                lhq0 lhq0Var = ((p4m) obj2).h;
                if (lhq0Var != null) {
                    lhq0Var.onClick(view);
                }
                return s3q0.a;
            case 4:
                com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f fVar = (com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) obj2;
                i.a aVar = (i.a) obj;
                gm50.a.a(fVar, aVar.a, new rmg(fVar, i2));
                int i10 = 17;
                gm50.a.a(fVar, aVar.b, new lbe(fVar, i10));
                gm50.a.a(fVar, aVar.c, new yve(fVar, i10));
                gm50.a.a(fVar, aVar.d, new t3h(fVar, i4));
                gm50.a.a(fVar, aVar.e, new ozh(fVar, i3));
                gm50.a.a(fVar, aVar.f, new x2e(fVar, 12));
                gm50.a.a(fVar, aVar.g, new cqf(fVar, i10));
                gm50.a.a(fVar, aVar.h, new j9k(fVar, i7));
                return s3q0.a;
            case 5:
                ((vkq) obj2).b = (List) obj;
                return s3q0.a;
            case 6:
                ((FriendsCatalogRootVh) obj2).i8(vyh0.a);
                return s3q0.a;
            case 7:
                ((View) obj2).performClick();
                ((etv0) obj).b(false);
                return s3q0.a;
            case 8:
                gzs<s3q0> gzsVar = ((inv.a) obj2).d;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 9:
                List list = (List) obj2;
                ((oxy) obj).i(list.size(), new rrv(new l8k(i2), list), new srv(list), new jai(-334987442, new trv(list), true));
                return s3q0.a;
            case 10:
                y6k y6kVar = ((ImCreateChatFragment) obj2).X;
                (y6kVar != null ? y6kVar : null).X0();
                return s3q0.a;
            case 11:
                com.vk.im.video.g gVar = (com.vk.im.video.g) obj2;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar2 = gVar.a0;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                gVar.a0 = cVar;
                return s3q0.a;
            case 12:
                SetBuilder h = ((n5w) ((drz.a) obj).a).c.Ab().h();
                final n8w n8wVar = ((z5w) obj2).c;
                final Set g = izi0.g(h, n8wVar.d);
                if (!g.isEmpty()) {
                    io.reactivex.rxjava3.internal.operators.single.n nVar = new io.reactivex.rxjava3.internal.operators.single.n(n8wVar.a.b(n8wVar, n8wVar.b.d(new e1e0(h, Source.ACTUAL, true))), new l8w(new fh1(i4, n8wVar, g), i9));
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    new io.reactivex.rxjava3.internal.operators.flowable.o0(io.reactivex.rxjava3.core.g.i(0L));
                    Optional.empty();
                    Optional empty = Optional.empty();
                    pq60 pq60Var = new pq60(i8);
                    if (1 + 2147483646 > 2147483647L) {
                        throw new IllegalArgumentException("Integer overflow");
                    }
                    io.reactivex.rxjava3.core.g c0Var = new io.reactivex.rxjava3.internal.operators.flowable.c0(new io.reactivex.rxjava3.internal.operators.flowable.l0(), new b630(new u620(), i3));
                    if (Optional.of(2).isPresent()) {
                        c0Var = c0Var.n(((Number) r5.get()).intValue());
                    }
                    n8wVar.c.b(io.reactivex.rxjava3.kotlin.c.h(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.flowable.u0(new io.reactivex.rxjava3.internal.operators.flowable.r0(nVar.u(), new lfg0(c0Var, new kfg0(io.reactivex.rxjava3.internal.functions.a.g, arrayList4, arrayList3), pq60Var, empty.isPresent() ? (io.reactivex.rxjava3.core.w) empty.get() : io.reactivex.rxjava3.schedulers.a.a()))), new io.reactivex.rxjava3.functions.a() { // from class: xsna.m8w
                        @Override // io.reactivex.rxjava3.functions.a
                        public final void run() {
                            n8w.this.d.removeAll(g);
                        }
                    }), null, null, 3));
                }
                return s3q0.a;
            case 13:
                int i11 = ImSelectContactsFragment.v0;
                ((ImSelectContactsFragment) obj2).eo();
                return s3q0.a;
            case 14:
                kt00 kt00Var = ((com.vk.ecomm.reviews.impl.allreviews.presentation.d) obj2).d;
                Throwable th2 = ((ft00) obj).r;
                kt00Var.getClass();
                int i12 = R.string.market_all_reviews_base_error_screen_title;
                if (th2 != null && (th2 instanceof VKApiExecutionException) && h03.a(th2)) {
                    i12 = R.string.market_all_reviews_connection_error_screen_title;
                }
                int i13 = R.string.market_all_reviews_base_error_screen_description;
                if (th2 != null && (th2 instanceof VKApiExecutionException) && ((VKApiExecutionException) th2).s() == -1) {
                    i13 = R.string.market_all_reviews_connection_error_screen_description;
                }
                int i14 = R.string.market_all_reviews_base_error_screen_retry_button;
                if (th2 != null && (th2 instanceof VKApiExecutionException) && ((VKApiExecutionException) th2).s() == -1) {
                    i14 = R.string.market_all_reviews_connection_error_screen_retry_button;
                }
                return new hvp(i12, i13, i14);
            case 15:
                return new je90((ViewGroup) obj, 0, new foi((n310) obj2, 20));
            case 16:
                tj50.a aVar2 = (tj50.a) obj;
                a510 a510Var = ((r410) obj2).d;
                a510Var.getClass();
                oey oeyVar = new oey(i6);
                ao8 ao8Var = ao8.d;
                return new y410.b(aVar2.a(new f2s(a510Var, 18), ao8Var), aVar2.a(new pyz(i5), ao8Var), aVar2.a(new qey(4), ao8Var), aVar2.a(new x2y(a510Var, 8), ao8Var), aVar2.a(new jr3(24), ao8Var), aVar2.a(oeyVar, ao8Var), aVar2.a(new gt(29), ao8Var), aVar2.a(new zos(7), ao8Var), aVar2.a(new z410(i9), ao8Var));
            case 17:
                int intValue = ((Integer) obj).intValue();
                int i15 = MediaPickerFragment.Q;
                ((MediaPickerFragment) obj2).fo().b(intValue);
                return s3q0.a;
            case 18:
                ArrayList arrayList5 = (ArrayList) obj2;
                if (jyu0.a((iyu0) obj)) {
                    arrayList5.add("steps");
                }
                return s3q0.a;
            case 19:
                ((com.vk.translate.impl.views.b) obj2).a.Y0();
                return s3q0.a;
            case 20:
                fq30 fq30Var = (fq30) obj2;
                pk30 pk30Var = fq30Var.m;
                gq30 gq30Var = fq30Var.n;
                Msg msg = gq30Var != null ? gq30Var.u : null;
                Attach attach = gq30Var != null ? gq30Var.w : null;
                if (pk30Var != null && msg != null && attach != null) {
                    pk30Var.R(attach, msg, gq30Var != null ? gq30Var.v : null);
                }
                return s3q0.a;
            case 21:
                m340 m340Var = (m340) obj2;
                m340Var.c = true;
                BaseSharingExternalActivity baseSharingExternalActivity = m340Var.a.get();
                if (baseSharingExternalActivity != null) {
                    m340Var.c(baseSharingExternalActivity);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 22:
                createPublisher$lambda$13 = OkmpStreamer.createPublisher$lambda$13((OkmpStreamer) obj2, ((Integer) obj).intValue());
                return createPublisher$lambda$13;
            case 23:
                i0q0.j(new k50(i7, (gm80) obj2, (o7o) obj));
                return s3q0.a;
            case 24:
                return ((ProfilesInfo) obj).Bb((Peer) obj2).name();
            case 25:
                eka0 eka0Var = (eka0) obj2;
                eka0Var.a();
                eka0Var.p.b((xja0) obj);
                return s3q0.a;
            case 26:
                ((e2b0) obj2).S((String) obj);
                return s3q0.a;
            case 27:
                PlaylistOwner playlistOwner = (PlaylistOwner) obj2;
                w9y w9yVar = (w9y) obj;
                w9yVar.d(Long.valueOf(playlistOwner.b.b), "owner_id");
                w9yVar.e(playlistOwner.c, "owner_name");
                w9yVar.e(playlistOwner.d, "owner_name_gen");
                w9yVar.e(playlistOwner.e, "owner_full_name");
                w9yVar.c(Integer.valueOf(playlistOwner.f.h()), "sex");
                w9yVar.e(playlistOwner.g, "owner_full_name_dat");
                w9yVar.g("owner_image", playlistOwner.h);
                return s3q0.a;
            case 28:
                zpb0 zpb0Var = (zpb0) obj2;
                Long l = (Long) obj;
                l.getClass();
                if (zpb0Var != null) {
                    return (String) zpb0Var.d.get(l);
                }
                return null;
            default:
                final enc0 enc0Var = (enc0) obj2;
                final TabLayout.g gVar2 = (TabLayout.g) obj;
                int i16 = com.vk.core.view.components.tabs.d.G;
                final nxv0 a = d.a.a(gVar2.h.getContext());
                a.setText(gVar2.c);
                List<MediaPickerState.Tab> list2 = enc0.q0;
                MediaPickerState.Tab tab = MediaPickerState.Tab.LocalAlbum;
                final int indexOf = list2.indexOf(tab);
                int i17 = gVar2.e;
                a.setId(i17 == list2.indexOf(tab) ? R.id.posting_media_picker_recent_tab : i17 == list2.indexOf(MediaPickerState.Tab.PhotoVk) ? R.id.posting_media_picker_photo_tab : i17 == list2.indexOf(MediaPickerState.Tab.VideoVk) ? R.id.posting_media_picker_video_tab : View.generateViewId());
                if (gVar2.e == indexOf) {
                    a.setOnClickListener(new View.OnClickListener() { // from class: xsna.dnc0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            final enc0 enc0Var2 = enc0.this;
                            VkTabLayout vkTabLayout = enc0Var2.s;
                            if (vkTabLayout.getSelectedTabPosition() == indexOf && enc0Var2.X.size() >= 2) {
                                int l2 = krv0.l(R.attr.vk_ui_icon_accent);
                                nxv0 nxv0Var = a;
                                nxv0Var.getContext();
                                e.b bVar = new e.b(nxv0Var, null, null, l2, 6);
                                bVar.w = R.layout.media_picker_local_album_popup_item;
                                List<LocalAlbum> list3 = enc0Var2.X;
                                ArrayList arrayList6 = new ArrayList(c5g.u(list3, 10));
                                final int i18 = 0;
                                for (Object obj3 : list3) {
                                    int i19 = i18 + 1;
                                    if (i18 < 0) {
                                        e43.t();
                                        throw null;
                                    }
                                    final LocalAlbum localAlbum = (LocalAlbum) obj3;
                                    arrayList6.add(new VkContextMenu.a(enc0Var2.c(localAlbum), null, null, false, false, new gzs() { // from class: xsna.anc0
                                        @Override // xsna.gzs
                                        public final Object invoke() {
                                            MediaPickerState.Tab tab2 = MediaPickerState.Tab.LocalAlbum;
                                            enc0 enc0Var3 = enc0.this;
                                            enc0Var3.g(tab2);
                                            enc0Var3.U.invoke(new PostingAction$MediaPicker$Album$SelectAlbum(localAlbum.b, i18));
                                            return s3q0.a;
                                        }
                                    }, 30));
                                    i18 = i19;
                                }
                                bVar.h(arrayList6);
                                bVar.l(false);
                            }
                            vkTabLayout.c(gVar2, true);
                        }
                    });
                }
                return a;
        }
    }

    public /* synthetic */ ekh(hil.b bVar, ur4 ur4Var) {
        this.b = 2;
        this.c = ur4Var;
    }

    public /* synthetic */ ekh(p4m p4mVar, p4m.a aVar) {
        this.b = 3;
        this.c = p4mVar;
    }
}
