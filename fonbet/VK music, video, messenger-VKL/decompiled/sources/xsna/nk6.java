package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class nk6 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nk6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                NewsfeedCoowners.CoownerStatus coownerStatus = (NewsfeedCoowners.CoownerStatus) obj;
                return coownerStatus != null && coownerStatus.b.b.b == ((UserId) this.b).b;
            default:
                return ((Boolean) ((fa00) this.b).invoke(obj)).booleanValue();
        }
    }
}
