package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.fragments.ContactsListFragmentRedesign;
import com.vk.search.params.api.VkFeedSearchParams;
import com.vkontakte.android.R;
import java.util.Collection;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b5b0;
import xsna.equ0;
import xsna.r0i;

/* compiled from: ClipsScreenSpinnerDialog.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class i2f extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2f(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (((java.lang.Boolean) r1.b.invoke()).booleanValue() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r1.b == false) goto L19;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        equ0.b bVar;
        long j;
        Peer.Type type;
        boolean z = false;
        switch (this.b) {
            case 0:
                ((l2f) this.receiver).cancel();
                return s3q0.a;
            case 1:
                com.vk.profile.core.scheduled_clips.h hVar = (com.vk.profile.core.scheduled_clips.h) this.receiver;
                hVar.getClass();
                hVar.i.setContent(new jai(625736787, new qed(3, r0i.b.a, hVar), true));
                return s3q0.a;
            case 2:
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
                        o0w b = mxvVar.b();
                        Context context2 = equ0Var.m;
                        o0w.x(b, context2 == null ? null : context2, null, e, null, null, null, false, null, null, null, null, null, null, "new_contact_hint", null, null, null, true, null, null, null, null, null, 1071636474);
                    }
                }
                com.vk.core.tips.b bVar2 = o8jVar.e;
                if (bVar2 != null) {
                    bVar2.b(false);
                }
                o8jVar.e = null;
                return s3q0.a;
            case 3:
                zak0 zak0Var = (zak0) ((o4r) this.receiver).j1;
                VkFeedSearchParams copy = ((VkFeedSearchParams) zak0Var.getValue()).copy();
                VkFeedSearchParams.SortType sortType = copy.b;
                VkFeedSearchParams.SortType sortType2 = VkFeedSearchParams.SortType.RELEVANT;
                if (sortType == sortType2) {
                    sortType2 = VkFeedSearchParams.SortType.DATE;
                }
                copy.b = sortType2;
                zak0Var.setValue(copy);
                return s3q0.a;
            default:
                p1b0 p1b0Var = ((b5b0) this.receiver).b;
                if (p1b0Var != null) {
                    if (!(p1b0Var instanceof b5b0.b)) {
                        if (p1b0Var instanceof b5b0.a) {
                            b5b0.a aVar2 = (b5b0.a) p1b0Var;
                            if (!aVar2.a) {
                                break;
                            }
                        }
                    } else {
                        b5b0.b bVar3 = (b5b0.b) p1b0Var;
                        if (!((Boolean) bVar3.a.invoke()).booleanValue()) {
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2f(Object obj) {
        super(0, obj, com.vk.profile.core.scheduled_clips.h.class, "hideDatePicker", "hideDatePicker()V", 0);
        this.b = 1;
    }
}
