package xsna;

import com.vk.dto.group.Group;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GetUserRoleInCommunityUseCaseImpl.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class jwt extends FunctionReferenceImpl implements izs<Group, Boolean> {
    public static final jwt b = new jwt(1, Group.class, "canEdit", "canEdit()Z", 0);

    @Override // xsna.izs
    public final Boolean invoke(Group group) {
        return Boolean.valueOf(group.e());
    }
}
