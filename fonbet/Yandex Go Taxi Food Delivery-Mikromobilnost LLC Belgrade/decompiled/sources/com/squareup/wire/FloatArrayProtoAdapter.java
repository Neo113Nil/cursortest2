package com.squareup.wire;

import defpackage.qoi0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 ¨\u0006!"}, d2 = {"Lcom/squareup/wire/FloatArrayProtoAdapter;", "Lcom/squareup/wire/ProtoAdapter;", "", "", "originalAdapter", "<init>", "(Lcom/squareup/wire/ProtoAdapter;)V", "Lcom/squareup/wire/ProtoWriter;", "writer", "", "tag", "value", "Lzy11;", "encodeWithTag", "(Lcom/squareup/wire/ProtoWriter;I[F)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;I[F)V", "encodedSize", "([F)I", "encodedSizeWithTag", "(I[F)I", "encode", "(Lcom/squareup/wire/ProtoWriter;[F)V", "(Lcom/squareup/wire/ReverseProtoWriter;[F)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)[F", "Lcom/squareup/wire/ProtoReader32;", "(Lcom/squareup/wire/ProtoReader32;)[F", "redact", "([F)[F", "Lcom/squareup/wire/ProtoAdapter;", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatArrayProtoAdapter extends ProtoAdapter<float[]> {
    private final ProtoAdapter<Float> originalAdapter;

    public FloatArrayProtoAdapter(ProtoAdapter<Float> protoAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, qoi0.a(float[].class), null, protoAdapter.getSyntax(), new float[0], null, 32, null);
        this.originalAdapter = protoAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public float[] decode(ProtoReader reader) {
        return new float[]{Float.intBitsToFloat(reader.readFixed32())};
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, float[] value) {
        for (float f : value) {
            this.originalAdapter.encode(writer, (ProtoWriter) Float.valueOf(f));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter writer, int tag, float[] value) {
        if (value != null) {
            if (value.length == 0) {
                return;
            }
            super.encodeWithTag(writer, tag, (int) value);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(float[] value) {
        int i = 0;
        for (float f : value) {
            i += this.originalAdapter.encodedSize(Float.valueOf(f));
        }
        return i;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int tag, float[] value) {
        if (value == null || value.length == 0) {
            return 0;
        }
        return super.encodedSizeWithTag(tag, (int) value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public float[] redact(float[] value) {
        return new float[0];
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter writer, int tag, float[] value) {
        if (value != null) {
            if (value.length == 0) {
                return;
            }
            super.encodeWithTag(writer, tag, (int) value);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public float[] decode(ProtoReader32 reader) {
        return new float[]{Float.intBitsToFloat(reader.readFixed32())};
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, float[] value) {
        int length = value.length;
        while (true) {
            length--;
            if (-1 >= length) {
                return;
            } else {
                writer.writeFixed32(Float.floatToIntBits(value[length]));
            }
        }
    }
}
