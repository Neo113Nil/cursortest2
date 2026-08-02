package xsna;

import com.vk.newsfeed.domain.model.NewsfeedInitialPost;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;
import xsna.r070;

/* compiled from: NewsfeedMainInitialStateFactory.kt */
/* loaded from: classes4.dex */
public final class kt60 {
    public static Pair a(int i, String str, NewsfeedInitialPost newsfeedInitialPost) {
        return new Pair(qz60.a(qz60.j, null, i, str, null, null, null, null, newsfeedInitialPost, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), c(new r070.h.b(i, str, newsfeedInitialPost != null)));
    }

    public static Pair b(int i, String str) {
        return new Pair(qz60.a(qz60.j, null, i, str, null, null, null, null, null, 249), c(new r070.h.b(i, str, true)));
    }

    public static ArrayList c(r070... r070VarArr) {
        return j5g.u0(e43.l(r070.d.c.b, r070.d.a.b, r070.d.b.b), e43.l(Arrays.copyOf(r070VarArr, r070VarArr.length)));
    }
}
