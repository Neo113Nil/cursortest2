package xsna;

import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.newsfeed.common.presentation.model.items.CoownershipStatusUiDto;
import java.util.List;

/* compiled from: PostMviPatch.kt */
/* loaded from: classes4.dex */
public interface h5c0 extends yl50 {

    /* compiled from: PostMviPatch.kt */
    public interface a extends h5c0 {

        /* compiled from: PostMviPatch.kt */
        /* renamed from: xsna.h5c0$a$a, reason: collision with other inner class name */
        public static final class C2973a implements a {
            public final List<NewsfeedCoowners.CoownerRequest> a;
            public final CoownershipStatusUiDto b;

            public C2973a(CoownershipStatusUiDto coownershipStatusUiDto, List list) {
                this.a = list;
                this.b = coownershipStatusUiDto;
            }
        }
    }

    /* compiled from: PostMviPatch.kt */
    public static final class b implements h5c0 {
    }
}
