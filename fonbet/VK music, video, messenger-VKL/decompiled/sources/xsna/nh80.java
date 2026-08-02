package xsna;

import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.core.preference.Preference;
import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh80 implements io.reactivex.rxjava3.functions.n {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nh80(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final Object get() {
        switch (this.b) {
            case 0:
                return io.reactivex.rxjava3.core.x.k(Boolean.valueOf(((ph80) this.c).a.o()));
            default:
                bam0 bam0Var = (bam0) this.c;
                String s = Preference.s("StoryPrivacyCache", "GroupsResponse", "");
                GroupsGetObjectExtendedResponseDto groupsGetObjectExtendedResponseDto = null;
                if (s.length() != 0) {
                    try {
                        groupsGetObjectExtendedResponseDto = (GroupsGetObjectExtendedResponseDto) bam0Var.d.fromJson(s, GroupsGetObjectExtendedResponseDto.class);
                    } catch (Throwable th) {
                        L.i(th);
                    }
                }
                return groupsGetObjectExtendedResponseDto == null ? io.reactivex.rxjava3.internal.operators.observable.g0.b : io.reactivex.rxjava3.core.q.T(groupsGetObjectExtendedResponseDto).U(new qca0(new xd40(bam0Var, 24), 6)).U(new yzt(new oi40(22), 15)).U(new aam0(new viu(24), 0));
        }
    }
}
