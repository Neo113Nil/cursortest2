package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import xsna.is60;

/* compiled from: UserProfileWallViewStateMapper.kt */
/* loaded from: classes4.dex */
public final class yxq0 {
    public static final xxq0 a(dwq0 dwq0Var) {
        ur60 ur60Var = dwq0Var.q;
        boolean z = ur60Var.g;
        ListLoadingState listLoadingState = ur60Var.e;
        sq60 sq60Var = ur60Var.b;
        boolean z2 = z || (sq60Var.a.isEmpty() && listLoadingState == ListLoadingState.ERROR);
        return new xxq0(dwq0Var.c, dwq0Var.e, dwq0Var.f, dwq0Var.g, dwq0Var.h, new is60.a(sq60Var, listLoadingState, ur60Var.f, z2), z2, dwq0Var.p);
    }
}
