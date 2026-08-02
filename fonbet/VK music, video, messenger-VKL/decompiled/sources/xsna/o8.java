package xsna;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.facebook.soloader.MinElf;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.fragments.ContactsListFragmentRedesign;
import com.vk.location.common.LocationCommon;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vk.stories.design.view.stats.tabs.info.mvi.StoryStatisticsInfoFragment;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vk.voip.ui.call_by_phone.ui.ActionButtonState;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.a9j0;
import xsna.eeu0;
import xsna.equ0;
import xsna.h7u0;
import xsna.o0r0;
import xsna.pii0;
import xsna.xn50;

/* compiled from: AboutVideoItemsLoader.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class o8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        equ0.b bVar;
        long j;
        Peer.Type type;
        int i = 1;
        byte b = 0;
        switch (this.b) {
            case 0:
                return t8.a((t8) this.receiver, (hfz) obj);
            case 1:
                ((j2r0) this.receiver).getClass();
                return j2r0.a((UsersUserFullDto) obj);
            case 2:
                L.i((Throwable) obj);
                return s3q0.a;
            case 3:
                CommunityProfileFragment communityProfileFragment = (CommunityProfileFragment) this.receiver;
                communityProfileFragment.getClass();
                xn50.a.c(communityProfileFragment, (CommunityProfileAction) obj);
                return s3q0.a;
            case 4:
                o8j o8jVar = (o8j) this.receiver;
                Collection<Contact> collection = o8jVar.f;
                if (collection != null && (bVar = gqu0.this.d) != null) {
                    equ0 equ0Var = equ0.this;
                    mxv mxvVar = equ0Var.j;
                    if (collection.size() > 1) {
                        mxvVar.getClass();
                        Context context = equ0Var.m;
                        if (context == null) {
                            context = null;
                        }
                        bc6 L = xa4.L(context);
                        ContactsListFragmentRedesign.a aVar = new ContactsListFragmentRedesign.a();
                        ContactsListFactory contactsListFactory = ContactsListFactory.CONTACTS_LIST_VKAPP;
                        Bundle bundle = aVar.j;
                        bundle.putSerializable("factory", contactsListFactory);
                        aVar.s(true);
                        aVar.y(R.attr.im_ic_back_toolbar);
                        bundle.putString("force_entry_point_for_new", "new_contact_hint");
                        bundle.putString("force_entry_point_for_create_contact", "contact_list_vk_create_contact");
                        aVar.m(L);
                    } else if (collection.size() == 1) {
                        Contact contact = (Contact) j5g.X(collection);
                        Long l = contact.j;
                        if (l != null) {
                            j = l.longValue();
                            type = Peer.Type.USER;
                        } else {
                            j = contact.b;
                            type = Peer.Type.CONTACT;
                        }
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        long e = Peer.a.e(j, type);
                        o0r0 d = mxvVar.d();
                        Context context2 = equ0Var.m;
                        if (context2 == null) {
                            context2 = null;
                        }
                        d.m(context2, new UserId(e), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                    }
                }
                com.vk.core.tips.b bVar2 = o8jVar.e;
                if (bVar2 != null) {
                    bVar2.b(false);
                }
                o8jVar.e = null;
                return s3q0.a;
            case 5:
                typ0 typ0Var = (typ0) obj;
                rlh rlhVar = ((dhk) this.receiver).c;
                if (rlhVar != null) {
                    rlhVar.invoke(typ0Var);
                }
                return s3q0.a;
            case 6:
                return ((q73) this.receiver).h((List) obj);
            case 7:
                Throwable th = (Throwable) obj;
                ((LocationCommon) this.receiver).getClass();
                x7r0 x7r0Var = LocationCommon.c.a;
                if (x7r0Var != null) {
                    x7r0Var.invoke(th);
                }
                return s3q0.a;
            case 8:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 9:
                String str = (String) obj;
                RestoreSearchFragment restoreSearchFragment = (RestoreSearchFragment) this.receiver;
                if (!epx.f(restoreSearchFragment.d0, str)) {
                    restoreSearchFragment.d0 = str;
                    RestoreSearchFragment.b bVar3 = restoreSearchFragment.a0;
                    (bVar3 != null ? bVar3 : null).clear();
                    io.reactivex.rxjava3.disposables.c cVar2 = restoreSearchFragment.c0;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    com.vk.lists.c cVar3 = restoreSearchFragment.b0;
                    if (cVar3 != null) {
                        cVar3.p(false);
                    }
                }
                return s3q0.a;
            case 10:
                return ((afa) this.receiver).a((CatalogSectionResponseObjectDto) obj);
            case 11:
                a9j0 a9j0Var = (a9j0) obj;
                e8j0 e8j0Var = (e8j0) this.receiver;
                Context context3 = e8j0Var.i1;
                a2m0 a2m0Var = e8j0Var.q1;
                if (a9j0Var instanceof a9j0.b) {
                    UserId userId = ((a9j0.b) a9j0Var).a;
                    if (e8j0Var.y1 == null) {
                        int i2 = fkq0.b(userId) ? R.string.highlight_create_description_group : R.string.highlight_create_description;
                        int i3 = h7u0.p;
                        h7u0.a c = h7u0.b.c(context3);
                        c.a0(new q43(e8j0Var, i));
                        eeu0.a.C2801a c2801a = new eeu0.a.C2801a(c);
                        c2801a.f(R.string.highlight_create_title);
                        c2801a.d = c.getContext().getString(i2);
                        c2801a.c(R.string.save, new com.vk.movika.tools.controls.seekbar.l(e8j0Var, 13), false);
                        c2801a.n = true;
                        c2801a.s = new th5(b, 3);
                        c2801a.q = true;
                        e8j0Var.y1 = c2801a.g();
                    }
                } else if (a9j0Var instanceof a9j0.g) {
                    e8j0Var.hide();
                    e8j0Var.A1 = new fqd(12, e8j0Var, a9j0Var);
                } else if (a9j0Var instanceof a9j0.a) {
                    a9j0.a aVar2 = (a9j0.a) a9j0Var;
                    e8j0Var.m1.invoke(aVar2.a, aVar2.b, aVar2.c);
                } else if (a9j0Var instanceof a9j0.f) {
                    y440 y440Var = e8j0Var.j1;
                    StoryMultiData storyMultiData = ((a9j0.f) a9j0Var).a;
                    if (y440Var != null && storyMultiData != null) {
                        int i4 = 0;
                        int i5 = 2;
                        int i6 = 2;
                        new pii0.a(context3, y440Var, storyMultiData, new i37(1, a2m0Var, a2m0.class, "onOpenDialog", "onOpenDialog(J)V", i4, 14), new clh(i6, a2m0Var, a2m0.class, "onSendToChat", "onSendToChat(Lcom/vk/story/api/domain/interactor/upload/StoryMultiData;J)V", i4, i5), new dlh(i6, a2m0Var, a2m0.class, "onCreateChat", "onCreateChat(Lcom/vk/navigation/ActivityLauncher;I)V", i4, i5)).I0("SendStoryUsersBottomSheet");
                    }
                } else if (epx.f(a9j0Var, a9j0.d.a)) {
                    e8j0Var.o1.invoke(new b8j0(e8j0Var, b));
                } else if (epx.f(a9j0Var, a9j0.e.a)) {
                    e8j0Var.n1.invoke(new e9i0(e8j0Var, 4));
                } else if (a9j0Var instanceof a9j0.h) {
                    cvk.w(j03.g(context3, ((a9j0.h) a9j0Var).a, R.string.error), false);
                } else {
                    if (!(a9j0Var instanceof a9j0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    androidx.appcompat.app.d dVar = e8j0Var.y1;
                    if (dVar != null) {
                        dVar.hide();
                    }
                    e8j0Var.y1 = null;
                }
                return s3q0.a;
            case 12:
                StoryStatisticsInfoFragment storyStatisticsInfoFragment = (StoryStatisticsInfoFragment) this.receiver;
                storyStatisticsInfoFragment.getClass();
                xn50.a.c(storyStatisticsInfoFragment, (com.vk.stories.design.view.stats.tabs.info.mvi.a) obj);
                return s3q0.a;
            case 13:
                ((p4n0) this.receiver).a((a5n0) obj);
                return s3q0.a;
            default:
                zkj zkjVar = (zkj) obj;
                ngw0 ngw0Var = (ngw0) this.receiver;
                VkInputSelect vkInputSelect = ngw0Var.m1;
                if (vkInputSelect == null) {
                    vkInputSelect = null;
                }
                boolean z = zkjVar.c;
                tlo0 tlo0Var = zkjVar.d;
                ActionButtonState actionButtonState = zkjVar.b;
                vkInputSelect.setError(z);
                VkFormField vkFormField = ngw0Var.i1;
                if (vkFormField == null) {
                    vkFormField = null;
                }
                vkFormField.setActiveInputButtonContentDescription(ngw0Var.getString(R.string.clear_input));
                VkButton vkButton = ngw0Var.j1;
                if (vkButton == null) {
                    vkButton = null;
                }
                vkButton.setEnabled(zkjVar.a);
                if (actionButtonState.k() != null) {
                    VkButton vkButton2 = ngw0Var.j1;
                    if (vkButton2 == null) {
                        vkButton2 = null;
                    }
                    vkButton2.setText(actionButtonState.k().intValue());
                } else {
                    VkButton vkButton3 = ngw0Var.j1;
                    if (vkButton3 == null) {
                        vkButton3 = null;
                    }
                    vkButton3.setText("");
                }
                VkButton vkButton4 = ngw0Var.j1;
                if (vkButton4 == null) {
                    vkButton4 = null;
                }
                vkButton4.setMode(actionButtonState.j());
                VkButton vkButton5 = ngw0Var.j1;
                if (vkButton5 == null) {
                    vkButton5 = null;
                }
                vkButton5.setAppearance(actionButtonState.h());
                VkButton vkButton6 = ngw0Var.j1;
                if (vkButton6 == null) {
                    vkButton6 = null;
                }
                vkButton6.a5(true, actionButtonState.i());
                VkButton vkButton7 = ngw0Var.k1;
                if (vkButton7 == null) {
                    vkButton7 = null;
                }
                bwt0.p0(vkButton7, zkjVar.g);
                VkButton vkButton8 = ngw0Var.k1;
                if (vkButton8 == null) {
                    vkButton8 = null;
                }
                vkButton8.setEnabled(true ^ actionButtonState.l());
                if (tlo0Var != null) {
                    TextView textView = ngw0Var.l1;
                    if (textView == null) {
                        textView = null;
                    }
                    textView.setVisibility(0);
                    TextView textView2 = ngw0Var.l1;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    textView2.setText(tlo0Var.a(ngw0Var.requireContext()));
                } else {
                    TextView textView3 = ngw0Var.l1;
                    if (textView3 == null) {
                        textView3 = null;
                    }
                    f4m.j(textView3);
                }
                if (zkjVar.e) {
                    VkInputSelect vkInputSelect2 = ngw0Var.m1;
                    if (vkInputSelect2 == null) {
                        vkInputSelect2 = null;
                    }
                    vkInputSelect2.setText("");
                }
                if (zkjVar.f) {
                    VkInputSelect vkInputSelect3 = ngw0Var.m1;
                    mhy.j(vkInputSelect3 != null ? vkInputSelect3 : null);
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(Object obj, int i) {
        super(1, obj, j2r0.class, "map", "map(Lcom/vk/api/generated/users/dto/UsersUserFullDto;)Lcom/vk/dto/user/UserProfile;", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 3:
                super(1, obj, CommunityProfileFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
                break;
            case 7:
                super(1, obj, LocationCommon.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
                break;
            case 8:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 14:
                super(1, obj, ngw0.class, "renderState", "renderState(Lcom/vk/voip/ui/call_by_phone/ui/ContentState;)V", 0);
                break;
            default:
                break;
        }
    }
}
