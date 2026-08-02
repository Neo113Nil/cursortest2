package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.user.UserProfile;
import com.vk.im.ui.components.contacts.c;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.qrcode.d;
import com.vk.search.discover.query.SearchQueryValueHelper;
import com.vk.search.ui.api.SearchQuery;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.saj;
import xsna.vyh;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class xxh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xxh(Activity activity, com.vk.qrcode.c cVar, d.b bVar, cme0 cme0Var) {
        this.b = 6;
        this.c = activity;
        this.d = cVar;
        this.e = bVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b bVar = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b) this.c;
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b.d((wk50.a) this.d, false, (vzh) this.e);
                bVar.b.b(new vyh.f(tq.h(tlo0.Companion, R.string.default_network_error)));
                return s3q0.a;
            case 1:
                saj sajVar = (saj) this.c;
                LayoutInflater layoutInflater = (LayoutInflater) this.d;
                saj.a aVar = (saj.a) this.e;
                ViewGroup viewGroup = (ViewGroup) obj;
                return sajVar.i ? new uwa(layoutInflater.inflate(R.layout.vkim_channel_select_subscribers, viewGroup, false), aVar) : new vwa(layoutInflater.inflate(R.layout.vkim_channel_select_subscribers_old, viewGroup, false), aVar);
            case 2:
                com.vk.im.ui.components.contacts.c cVar = (com.vk.im.ui.components.contacts.c) this.c;
                String str = (String) this.d;
                c.a aVar2 = (c.a) this.e;
                qtd0 qtd0Var = (qtd0) obj;
                cVar.x.put(str, qtd0Var);
                owi.a(cVar.r, cVar.s, new foi(cVar, 2));
                aVar2.y(qtd0Var);
                return s3q0.a;
            case 3:
                ((wq30) this.c).s((br30) this.d, (AttachGift) this.e);
                return s3q0.a;
            case 4:
                return io.reactivex.rxjava3.core.a.l(new rwj((vh40) this.c, (UserId) this.d, (UserId) this.e, (MusicTrack) obj));
            case 5:
                return Boolean.valueOf(PhotoEditorView.a((PhotoEditorView) this.c, (Ref$ObjectRef) this.d, (Ref$ObjectRef) this.e, (MotionEvent) obj));
            case 6:
                Activity activity = (Activity) this.c;
                com.vk.qrcode.c cVar2 = (com.vk.qrcode.c) this.d;
                d.b bVar2 = (d.b) this.e;
                UserProfile userProfile = (UserProfile) obj;
                if (userProfile == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                com.vk.qrcode.d.b.f(activity, cVar2, userProfile, bVar2);
                return s3q0.a;
            case 7:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.c;
                SearchQueryValueHelper searchQueryValueHelper = (SearchQueryValueHelper) this.d;
                VkSearchView vkSearchView = (VkSearchView) this.e;
                SearchQuery searchQuery = ((SearchQueryValueHelper.a) obj).a;
                ref$BooleanRef.element = false;
                searchQueryValueHelper.c(searchQuery.b, vkSearchView);
                return s3q0.a;
            default:
                cgq0 cgq0Var = (cgq0) this.c;
                ImageView imageView = (ImageView) this.d;
                UserProfile userProfile2 = (UserProfile) this.e;
                if (!((pxo0) cgq0Var.x.getValue()).a()) {
                    imageView.setEnabled(false);
                    cgq0Var.v6(imageView.getContext(), userProfile2, imageView);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ xxh(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
