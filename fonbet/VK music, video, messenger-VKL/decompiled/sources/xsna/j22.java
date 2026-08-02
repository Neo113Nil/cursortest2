package xsna;

import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.vk.bridges.ImageViewer;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.documents.impl.list.DocumentsListFragment;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.catalog.impl.geo.b;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.voip.ui.broadcast.fragments.scheduled.BroadcastScheduledFragment;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import xsna.eqh;
import xsna.o1i;
import xsna.v5r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class j22 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j22(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((o9) obj2).invoke(obj);
                break;
            case 1:
                ((pl2) obj2).invoke(obj);
                break;
            case 2:
                ((pd) obj2).invoke(obj);
                break;
            case 3:
                ((d05) obj2).invoke(obj);
                break;
            case 4:
                ((pd) obj2).invoke(obj);
                break;
            case 5:
                ((pd) obj2).invoke(obj);
                break;
            case 6:
                ((io.reactivex.rxjava3.subjects.d) obj2).onNext((List) obj);
                break;
            case 7:
                ((pd) obj2).invoke(obj);
                break;
            case 8:
                int i2 = BroadcastScheduledFragment.U;
                ((pd) obj2).invoke(obj);
                break;
            case 9:
                float f = CameraUIView.w1;
                ((pd) obj2).invoke(obj);
                break;
            case 10:
                ((pd) obj2).invoke(obj);
                break;
            case 11:
                ChatFragment.d dVar = ChatFragment.w1;
                ((pd) obj2).invoke(obj);
                break;
            case 12:
                ((pd) obj2).invoke(obj);
                break;
            case 13:
                ((b.e) obj2).invoke(obj);
                break;
            case 14:
                ((pd) obj2).invoke(obj);
                break;
            case 15:
                ((pl2) obj2).invoke(obj);
                break;
            case 16:
                ((d05) obj2).invoke(obj);
                break;
            case 17:
                ((pl2) obj2).invoke(obj);
                break;
            case 18:
                ((kp1) obj2).invoke(obj);
                break;
            case 19:
                ((pl2) obj2).invoke(obj);
                break;
            case 20:
                eqh.a aVar = (eqh.a) obj2;
                VKList vKList = (VKList) obj;
                aVar.a = vKList.size() + aVar.a;
                aVar.b = vKList.i();
                ImageViewer.c<Photo> cVar = aVar.d;
                if (cVar != null) {
                    cVar.c(vKList);
                    break;
                }
                break;
            case 21:
                ((o1i.e) obj2).invoke(obj);
                break;
            case 22:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj2;
                String[] strArr = DebugDevSettingsFragment.t0;
                String lowerCase = ((pno0) obj).d().toString().trim().toLowerCase(Locale.ROOT);
                HashSet hashSet = debugDevSettingsFragment.r0;
                HashSet hashSet2 = debugDevSettingsFragment.q0;
                int size = debugDevSettingsFragment.N.g.S.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Preference Q = debugDevSettingsFragment.N.g.Q(i3);
                    if (Q instanceof PreferenceCategory) {
                        PreferenceCategory preferenceCategory = (PreferenceCategory) Q;
                        String str = preferenceCategory.n;
                        int size2 = preferenceCategory.S.size();
                        boolean z = false;
                        for (int i4 = 0; i4 < size2; i4++) {
                            Preference Q2 = preferenceCategory.Q(i4);
                            String str2 = Q2.n;
                            String charSequence = Q2.j.toString();
                            Locale locale = Locale.ROOT;
                            String lowerCase2 = charSequence.toLowerCase(locale);
                            CharSequence m = Q2.m();
                            String lowerCase3 = (m == null || m.length() == 0) ? null : m.toString().toLowerCase(locale);
                            boolean z2 = lowerCase2.contains(lowerCase) || (lowerCase3 != null && lowerCase3.contains(lowerCase));
                            if (Q2.z) {
                                if (!z2) {
                                    hashSet2.add(str2);
                                    Q2.K(false);
                                }
                            } else if (z2 && hashSet2.contains(str2)) {
                                hashSet2.remove(str2);
                                Q2.K(true);
                            }
                            if (Q2.z) {
                                z = true;
                            }
                        }
                        if (preferenceCategory.z) {
                            if (!z) {
                                hashSet.add(str);
                                preferenceCategory.K(false);
                            }
                        } else if (z && hashSet.contains(str)) {
                            hashSet.remove(str);
                            preferenceCategory.K(true);
                        }
                    }
                }
                break;
            case 23:
                ((l3f) obj2).invoke(obj);
                break;
            case 24:
                ((d05) obj2).invoke(obj);
                break;
            case 25:
                ((kp1) obj2).invoke(obj);
                break;
            case 26:
                ((x2e) obj2).invoke(obj);
                break;
            case 27:
                int i5 = DocumentsListFragment.V;
                ((d05) obj2).invoke(obj);
                break;
            default:
                ((v5r.a) obj2).invoke(obj);
                break;
        }
    }
}
