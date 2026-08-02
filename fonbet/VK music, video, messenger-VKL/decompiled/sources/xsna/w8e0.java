package xsna;

import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class w8e0 implements mp70 {
    @Override // xsna.wip
    public final void encode(Object obj, np70 np70Var) {
        Map.Entry entry = (Map.Entry) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(com.google.firebase.encoders.proto.b.g, entry.getKey());
        np70Var2.add(com.google.firebase.encoders.proto.b.h, entry.getValue());
    }
}
