package xsna;

import android.os.Build;
import android.os.Bundle;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorSelectorUserItem;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListItem;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.coc;
import xsna.doc;
import xsna.tzp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class moc implements pcs, Preference.b {
    public final /* synthetic */ androidx.fragment.app.d b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ moc(androidx.fragment.app.d dVar, Object obj, Object obj2) {
        this.b = dVar;
        this.c = obj;
        this.d = obj2;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.b;
        ListPreference listPreference = (ListPreference) this.c;
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) this.d;
        int i = SettingsGeneralFragment.z0;
        if (!(obj instanceof Boolean)) {
            return true;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        listPreference.F(!booleanValue);
        if (booleanValue) {
            listPreference.I(settingsGeneralFragment.getString(R.string.sett_autoplay_unavailable));
        } else {
            listPreference.I("%s");
        }
        settingsGeneralFragment.io(switchPreferenceCompat, booleanValue);
        sr10 sr10Var = dy2.a;
        if (sr10Var == null) {
            return true;
        }
        sr10Var.c = booleanValue;
        s3q0 s3q0Var = s3q0.a;
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        poc pocVar = (poc) this.b;
        doc.a aVar = (doc.a) this.c;
        eoc eocVar = (eoc) this.d;
        tzp0.c.a aVar2 = poc.l1;
        ArrayList<ClipsCoauthorSelectorUserItem> parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("co_result", ClipsCoauthorSelectorUserItem.class) : bundle.getParcelableArrayList("co_result");
        if (parcelableArrayList != null) {
            List singletonList = Collections.singletonList(aVar.a);
            ArrayList arrayList = new ArrayList(c5g.u(parcelableArrayList, 10));
            for (ClipsCoauthorSelectorUserItem clipsCoauthorSelectorUserItem : parcelableArrayList) {
                ClipCoauthorListItem.OwnerMin ownerMin = new ClipCoauthorListItem.OwnerMin(clipsCoauthorSelectorUserItem.b, clipsCoauthorSelectorUserItem.d(), clipsCoauthorSelectorUserItem.e);
                ClipCoauthorListItem.SubscribeState.Gone gone = ClipCoauthorListItem.SubscribeState.Gone.b;
                ArrayList arrayList2 = aVar.b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (((ClipCoauthorListItem) obj).e) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((ClipCoauthorListItem) it.next()).b.b);
                }
                arrayList.add(new ClipCoauthorListItem(ownerMin, false, gone, arrayList4.contains(clipsCoauthorSelectorUserItem.b), clipsCoauthorSelectorUserItem.g, clipsCoauthorSelectorUserItem.h));
            }
            ArrayList u0 = j5g.u0(arrayList, singletonList);
            ClipVideoFile clipVideoFile = (ClipVideoFile) pocVar.i1.getValue();
            ArrayList arrayList5 = new ArrayList();
            Iterator it2 = u0.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!((ClipCoauthorListItem) next).c) {
                    arrayList5.add(next);
                }
            }
            ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                ClipCoauthorListItem clipCoauthorListItem = (ClipCoauthorListItem) it3.next();
                UserId userId = clipCoauthorListItem.b.b;
                CoOwnerItem.StatusDto statusDto = clipCoauthorListItem.e ? CoOwnerItem.StatusDto.APPROVED : CoOwnerItem.StatusDto.PENDING;
                ClipCoauthorListItem.OwnerMin ownerMin2 = clipCoauthorListItem.b;
                arrayList6.add(new CoOwnerItem(userId, statusDto, new Owner(ownerMin2.b, ownerMin2.c, ownerMin2.d, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194296, null), clipCoauthorListItem.f, null));
            }
            wjs0.a(new fyr0(ClipVideoFile.Kb(clipVideoFile, false, null, null, arrayList6, null, null, null, 8355839)));
            wjs0.a(pwr0.a);
            eocVar.b(new coc.f(u0));
        }
        pocVar.getChildFragmentManager().f("co_request");
    }
}
