package defpackage;

import com.google.firebase.encoders.proto.Protobuf$IntEncoding;

/* loaded from: classes11.dex */
public @interface dvf0 {
    Protobuf$IntEncoding intEncoding() default Protobuf$IntEncoding.DEFAULT;

    int tag();
}
