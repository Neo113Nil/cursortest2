package com.yandex.messaging.ui.settings.folder.addChat;

import defpackage.ad0;
import defpackage.tls;
import defpackage.v4r0;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class AddChatFolderDialogModelKt$AddChatFolderDialogModel$2$2$1$1$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object value;
        ad0 ad0Var;
        boolean contains;
        Set set;
        String str = (String) obj;
        r0 r0Var = ((i) this.receiver).B;
        do {
            value = r0Var.getValue();
            ad0Var = (ad0) value;
            contains = ad0Var.b.contains(str);
            set = ad0Var.b;
        } while (!r0Var.k(value, ad0.a(ad0Var, null, contains ? v4r0.f(set, str) : v4r0.i(set, str), 1)));
        return zy11.a;
    }
}
