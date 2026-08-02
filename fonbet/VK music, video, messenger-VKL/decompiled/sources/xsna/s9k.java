package xsna;

import android.content.ContextWrapper;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: CreateQuestionAnonymityDialog.kt */
/* loaded from: classes5.dex */
public final class s9k extends a.C0785a {
    public final vl1 h;

    public s9k(ExtendedUserProfile extendedUserProfile, boolean z, ContextWrapper contextWrapper, vl1 vl1Var) {
        this.h = vl1Var;
        this.c = new r9k(this, 0);
        this.b = e43.l(new ModalActionSheetListItem(0, null, contextWrapper.getString(R.string.create_question_public), null, contextWrapper.getString(R.string.create_question_anonymity_public_body, extendedUserProfile.a.d), 0, null, !z, false, 362), new ModalActionSheetListItem(1, null, contextWrapper.getString(R.string.create_question_anonymously), null, contextWrapper.getString(R.string.create_question_anonymity_anonymously_body, extendedUserProfile.a.d), 0, null, z, false, 362));
    }
}
