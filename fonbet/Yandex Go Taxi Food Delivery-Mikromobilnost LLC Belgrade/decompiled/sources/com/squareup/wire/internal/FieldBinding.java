package com.squareup.wire.internal;

import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import defpackage.dzm;
import defpackage.ffx;
import defpackage.lfx;
import defpackage.loj;
import defpackage.tls;
import defpackage.wls;
import defpackage.ym11;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 O*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001OBI\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0017J!\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00028\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0019\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00160\u001e2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 J1\u0010\"\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00140!2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#J+\u0010$\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00140!2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00105\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u001a\u00107\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00104R\u001a\u0010:\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010>\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00102R\u0014\u0010?\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00102R\u001a\u0010@\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\bA\u0010)R(\u0010B\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00160\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\"\u0010D\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00140!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010F\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00140!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ER\u0018\u0010J\u001a\u0006\u0012\u0002\b\u00030G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0018\u0010L\u001a\u0006\u0012\u0002\b\u00030G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010IR\u0014\u0010M\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010)R\u0014\u0010N\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010)¨\u0006P"}, d2 = {"Lcom/squareup/wire/internal/FieldBinding;", "Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$Builder;", "B", "Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "Lcom/squareup/wire/WireField;", "wireField", "Ljava/lang/Class;", "messageType", "Ljava/lang/reflect/Field;", "messageField", "builderType", "", "writeIdentityValues", "Ljava/lang/ClassLoader;", "classLoader", "<init>", "(Lcom/squareup/wire/WireField;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/Class;ZLjava/lang/ClassLoader;)V", "builder", "", "value", "Lzy11;", "(Lcom/squareup/wire/Message$Builder;Ljava/lang/Object;)V", "set", Constants.KEY_MESSAGE, "get", "(Lcom/squareup/wire/Message;)Ljava/lang/Object;", "getFromBuilder", "(Lcom/squareup/wire/Message$Builder;)Ljava/lang/Object;", "Lkotlin/Function2;", "getBuilderSetter", "(Ljava/lang/Class;Lcom/squareup/wire/WireField;)Lwls;", "Lkotlin/Function1;", "getBuilderGetter", "(Ljava/lang/Class;Lcom/squareup/wire/WireField;)Ltls;", "getInstanceGetter", "(Ljava/lang/Class;)Ltls;", "Ljava/lang/reflect/Field;", "Z", "getWriteIdentityValues", "()Z", "Ljava/lang/ClassLoader;", "Lcom/squareup/wire/WireField$Label;", "label", "Lcom/squareup/wire/WireField$Label;", "getLabel", "()Lcom/squareup/wire/WireField$Label;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "wireFieldJsonName", "getWireFieldJsonName", "declaredName", "getDeclaredName", "", "tag", CA20Status.STATUS_USER_I, "getTag", "()I", "keyAdapterString", "adapterString", "redacted", "getRedacted", "builderSetter", "Lwls;", "builderGetter", "Ltls;", "instanceGetter", "Lcom/squareup/wire/ProtoAdapter;", "getKeyAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "keyAdapter", "getSingleAdapter", "singleAdapter", "isMap", "isMessage", "Companion", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FieldBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> extends FieldOrOneOfBinding<M, B> {
    private static final Regex IS_GETTER_FIELD_NAME_REGEX = new Regex("^is[^a-z].*$");
    private final String adapterString;
    private final tls builderGetter;
    private final wls builderSetter;
    private final ClassLoader classLoader;
    private final String declaredName;
    private final tls instanceGetter;
    private final String keyAdapterString;
    private final WireField.Label label;
    private final Field messageField;
    private final String name;
    private final boolean redacted;
    private final int tag;
    private final String wireFieldJsonName;
    private final boolean writeIdentityValues;

    public FieldBinding(WireField wireField, Class<M> cls, Field field, Class<B> cls2, boolean z, ClassLoader classLoader) {
        this.messageField = field;
        this.writeIdentityValues = z;
        this.classLoader = classLoader;
        this.label = wireField.label();
        this.name = field.getName();
        this.wireFieldJsonName = wireField.jsonName();
        this.declaredName = wireField.declaredName().length() == 0 ? field.getName() : wireField.declaredName();
        this.tag = wireField.tag();
        this.keyAdapterString = wireField.keyAdapter();
        this.adapterString = wireField.adapter();
        this.redacted = wireField.redacted();
        this.builderSetter = getBuilderSetter(cls2, wireField);
        this.builderGetter = getBuilderGetter(cls2, wireField);
        this.instanceGetter = getInstanceGetter(cls);
    }

    private final tls getBuilderGetter(Class<?> builderType, WireField wireField) {
        if (builderType.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new dzm(23, wireField);
        }
        try {
            return new dzm(24, builderType.getField(getName()));
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + builderType.getName() + '.' + this.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getBuilderGetter$lambda$0(WireField wireField, Message.Builder builder) {
        return ((KotlinConstructorBuilder) builder).get(wireField);
    }

    private final wls getBuilderSetter(Class<?> builderType, WireField wireField) {
        if (builderType.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new loj(19, wireField);
        }
        if (!wireField.label().isOneOf()) {
            try {
                return new loj(21, builderType.getField(getName()));
            } catch (NoSuchFieldException unused) {
                throw new AssertionError("No builder field " + builderType.getName() + '.' + this.getName());
            }
        }
        Class<?> type = this.messageField.getType();
        try {
            return new loj(20, builderType.getMethod(getName(), type));
        } catch (NoSuchMethodException unused2) {
            throw new AssertionError("No builder method " + builderType.getName() + '.' + this.getName() + '(' + type.getName() + ')');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getBuilderSetter$lambda$0(WireField wireField, Message.Builder builder, Object obj) {
        ((KotlinConstructorBuilder) builder).set(wireField, obj);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getBuilderSetter$lambda$1(Method method, Message.Builder builder, Object obj) {
        method.invoke(builder, obj);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getBuilderSetter$lambda$2(Field field, Message.Builder builder, Object obj) {
        field.set(builder, obj);
        return zy11.a;
    }

    private final tls getInstanceGetter(Class<M> messageType) {
        if (!Modifier.isPrivate(this.messageField.getModifiers())) {
            return new dzm(26, this);
        }
        String name = this.messageField.getName();
        if (!IS_GETTER_FIELD_NAME_REGEX.h(name)) {
            if (name.length() > 0) {
                name = ((Object) String.valueOf(name.charAt(0)).toUpperCase(Locale.ROOT)) + name.substring(1);
            }
            name = "get".concat(name);
        }
        return new dzm(25, messageType.getMethod(name, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getInstanceGetter$lambda$1(Method method, Message message) {
        return method.invoke(message, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getInstanceGetter$lambda$2(FieldBinding fieldBinding, Message message) {
        return fieldBinding.messageField.get(message);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getDeclaredName() {
        return this.declaredName;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public ProtoAdapter<?> getKeyAdapter() {
        return ProtoAdapter.INSTANCE.get(this.keyAdapterString, this.classLoader);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public WireField.Label getLabel() {
        return this.label;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getName() {
        return this.name;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getRedacted() {
        return this.redacted;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public ProtoAdapter<?> getSingleAdapter() {
        return ProtoAdapter.INSTANCE.get(this.adapterString, this.classLoader);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public int getTag() {
        return this.tag;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getWireFieldJsonName() {
        return this.wireFieldJsonName;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getWriteIdentityValues() {
        return this.writeIdentityValues;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMap() {
        return this.keyAdapterString.length() > 0;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMessage() {
        lfx type = getSingleAdapter().getType();
        return Message.class.isAssignableFrom(type != null ? ffx.N(type) : null);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void value(B builder, Object value) {
        if (getLabel().isRepeated()) {
            Object fromBuilder = getFromBuilder((FieldBinding<M, B>) builder);
            if (ym11.g(fromBuilder)) {
                ym11.b(fromBuilder).add(value);
                return;
            }
            if (fromBuilder instanceof List) {
                ArrayList arrayList = new ArrayList((Collection) fromBuilder);
                arrayList.add(value);
                set((FieldBinding<M, B>) builder, (Object) arrayList);
                return;
            } else {
                throw new ClassCastException("Expected a list type, got " + (fromBuilder != null ? fromBuilder.getClass() : null) + '.');
            }
        }
        if (this.keyAdapterString.length() <= 0) {
            set((FieldBinding<M, B>) builder, value);
            return;
        }
        Object fromBuilder2 = getFromBuilder((FieldBinding<M, B>) builder);
        if (ym11.h(fromBuilder2)) {
            ((Map) fromBuilder2).putAll((Map) value);
            return;
        }
        if (fromBuilder2 instanceof Map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) fromBuilder2);
            linkedHashMap.putAll((Map) value);
            set((FieldBinding<M, B>) builder, (Object) linkedHashMap);
        } else {
            throw new ClassCastException("Expected a map type, got " + (fromBuilder2 != null ? fromBuilder2.getClass() : null) + '.');
        }
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void set(B builder, Object value) {
        this.builderSetter.invoke(builder, value);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object get(M message) {
        return this.instanceGetter.invoke(message);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object getFromBuilder(B builder) {
        return this.builderGetter.invoke(builder);
    }

    public /* synthetic */ FieldBinding(WireField wireField, Class cls, Field field, Class cls2, boolean z, ClassLoader classLoader, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireField, cls, field, cls2, z, (i & 32) != 0 ? cls.getClassLoader() : classLoader);
    }
}
