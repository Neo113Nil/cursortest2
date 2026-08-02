package xsna;

import android.os.Parcelable;
import com.vk.channels.impl.list.g;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.im.channelcreation.impl.i;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.pending.PendingPhotoAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.o34;
import xsna.otb;
import xsna.qr60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class hz implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        Object obj2;
        Parcelable parcelable;
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((x4) obj3).invoke(obj);
                break;
            case 1:
                ((mb) obj3).invoke(obj);
                break;
            case 2:
                ((mb) obj3).invoke(obj);
                break;
            case 3:
                ((nh1) obj3).invoke(obj);
                break;
            case 4:
                int i2 = AppearanceSettingsWithBackgroundsFragment.b0;
                ((mb) obj3).invoke(obj);
                break;
            case 5:
                ((jh3) obj3).invoke(obj);
                break;
            case 6:
                ((mb) obj3).invoke(obj);
                break;
            case 7:
                ((mb) obj3).invoke(obj);
                break;
            case 8:
                ((lh) obj3).invoke(obj);
                break;
            case 9:
                ((mb) obj3).invoke(obj);
                break;
            case 10:
                ((mb) obj3).invoke(obj);
                break;
            case 11:
                ((com.vk.im.channelcreation.impl.b) obj3).n(new i.c((Throwable) obj));
                break;
            case 12:
                com.vk.channels.impl.list.b bVar = (com.vk.channels.impl.list.b) obj3;
                Throwable th = (Throwable) obj;
                bVar.s().b(th, new bu0(4));
                bVar.n(new g.b(th));
                break;
            case 13:
                ((otb.d) obj3).invoke(obj);
                break;
            case 14:
                ((mb) obj3).invoke(obj);
                break;
            case 15:
                ((k60) obj3).invoke(obj);
                break;
            case 16:
                ((mb) obj3).invoke(obj);
                break;
            case 17:
                ((mb) obj3).invoke(obj);
                break;
            case 18:
                ((ire) obj3).invoke(obj);
                break;
            case 19:
                ((k60) obj3).invoke(obj);
                break;
            case 20:
                ((ire) obj3).invoke(obj);
                break;
            case 21:
                ((ire) obj3).invoke(obj);
                break;
            case 22:
                ((rd1) obj3).invoke(obj);
                break;
            case 23:
                ual ualVar = (ual) obj3;
                CopyOnWriteArrayList<o34.a> copyOnWriteArrayList = ualVar.b;
                Object obj4 = null;
                Object obj5 = null;
                Attachment attachment = null;
                if (!(obj instanceof hcq0)) {
                    if (!(obj instanceof paq0)) {
                        if (obj instanceof abq0) {
                            int i3 = ((abq0) obj).a;
                            Iterator it = ualVar.a().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (((ju90) next).S() == i3) {
                                        obj4 = next;
                                    }
                                }
                            }
                            ju90<?> ju90Var = (ju90) obj4;
                            if (ju90Var != null) {
                                Iterator<o34.a> it2 = copyOnWriteArrayList.iterator();
                                while (it2.hasNext()) {
                                    it2.next().b(ju90Var);
                                }
                                break;
                            }
                        }
                    } else {
                        paq0 paq0Var = (paq0) obj;
                        int i4 = paq0Var.a;
                        Iterator it3 = ualVar.a().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                if (((ju90) obj2).S() == i4) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        ju90<?> ju90Var2 = (ju90) obj2;
                        if (ju90Var2 != null && (parcelable = paq0Var.b) != null) {
                            if (parcelable instanceof PhotoAttachment) {
                                if (ju90Var2 instanceof PendingPhotoAttachment) {
                                    ((PhotoAttachment) parcelable).o = ((PendingPhotoAttachment) ju90Var2).f;
                                }
                                attachment = (Attachment) parcelable;
                            } else if (parcelable instanceof MusicTrack) {
                                attachment = new AudioAttachment((MusicTrack) parcelable);
                            } else if (parcelable instanceof VideoFile) {
                                attachment = new VideoAttachment((VideoFile) parcelable);
                            } else if (parcelable instanceof Attachment) {
                                attachment = (Attachment) parcelable;
                            }
                            if (attachment != null) {
                                Iterator<o34.a> it4 = copyOnWriteArrayList.iterator();
                                while (it4.hasNext()) {
                                    it4.next().c(ju90Var2, attachment);
                                }
                                break;
                            }
                        }
                    }
                } else {
                    hcq0 hcq0Var = (hcq0) obj;
                    int i5 = hcq0Var.a;
                    Iterator it5 = ualVar.a().iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            Object next2 = it5.next();
                            if (((ju90) next2).S() == i5) {
                                obj5 = next2;
                            }
                        }
                    }
                    ju90<?> ju90Var3 = (ju90) obj5;
                    if (ju90Var3 != null) {
                        Iterator<o34.a> it6 = copyOnWriteArrayList.iterator();
                        while (it6.hasNext()) {
                            it6.next().a(ju90Var3, hcq0Var.b, hcq0Var.c);
                        }
                        break;
                    }
                }
                break;
            case 24:
                ((ire) obj3).invoke(obj);
                break;
            case 25:
                ((m4g) obj3).invoke(obj);
                break;
            case 26:
                ((lh) obj3).invoke(obj);
                break;
            case 27:
                ((k60) obj3).invoke(obj);
                break;
            case 28:
                ((bmt) obj3).e(new cmt(new qr60.a.e(ListLoadingState.ERROR)));
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                break;
            default:
                ((xht) obj3).invoke(obj);
                break;
        }
    }
}
