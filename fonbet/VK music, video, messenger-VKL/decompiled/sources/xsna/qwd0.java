package xsna;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.chip.Chip;
import com.vk.dto.posting.FriendsListPrivacyType;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.api.posting.listsfriends.ListsFriendsDefaultList;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qwd0 implements View.OnClickListener {
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ LinkedHashMap c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ProfileFriendsFragment e;
    public final /* synthetic */ EditText f;

    public /* synthetic */ qwd0(Ref$ObjectRef ref$ObjectRef, LinkedHashMap linkedHashMap, boolean z, ProfileFriendsFragment profileFriendsFragment, EditText editText) {
        this.b = ref$ObjectRef;
        this.c = linkedHashMap;
        this.d = z;
        this.e = profileFriendsFragment;
        this.f = editText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int i2 = ProfileFriendsFragment.k0;
        T t = this.b.element;
        (t == 0 ? null : (Dialog) t).dismiss();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.c.entrySet()) {
            if (((Chip) entry.getValue()).isChecked()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map.Entry entry2 = (Map.Entry) j5g.Z(linkedHashMap.entrySet());
        ProfileFriendsFragment profileFriendsFragment = this.e;
        if (entry2 != null) {
            FriendsListParams.FriendListCreation friendListCreation = new FriendsListParams.FriendListCreation(y8g0.e(oez.a((ListsFriendsDefaultList) entry2.getKey())), this.d, ((ListsFriendsDefaultList) entry2.getKey()).h());
            FriendsListPrivacyType.a aVar = FriendsListPrivacyType.Companion;
            Bundle arguments = profileFriendsFragment.getArguments();
            i = arguments != null ? arguments.getInt("privacy_type_key") : -1;
            aVar.getClass();
            new ProfileFriendsFragment.a(friendListCreation, FriendsListPrivacyType.a.a(i), null, null, false, 60).g(4331, profileFriendsFragment);
            return;
        }
        FriendsListParams.FriendListCreation friendListCreation2 = new FriendsListParams.FriendListCreation(this.f.getText().toString(), false, 0, 6, null);
        FriendsListPrivacyType.a aVar2 = FriendsListPrivacyType.Companion;
        Bundle arguments2 = profileFriendsFragment.getArguments();
        i = arguments2 != null ? arguments2.getInt("privacy_type_key") : -1;
        aVar2.getClass();
        new ProfileFriendsFragment.a(friendListCreation2, FriendsListPrivacyType.a.a(i), null, null, false, 60).g(4331, profileFriendsFragment);
    }
}
