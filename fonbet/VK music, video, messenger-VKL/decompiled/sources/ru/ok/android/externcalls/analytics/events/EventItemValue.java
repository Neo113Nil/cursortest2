package ru.ok.android.externcalls.analytics.events;

import java.util.Collection;
import java.util.Map;
import xsna.epx;
import xsna.vby;

/* compiled from: EventItemValue.kt */
/* loaded from: classes9.dex */
public interface EventItemValue {

    /* compiled from: EventItemValue.kt */
    @vby
    public static final class ArrStringValue implements EventItemValue {
        private final Collection<String> value;

        private /* synthetic */ ArrStringValue(Collection collection) {
            this.value = collection;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ArrStringValue m290boximpl(Collection collection) {
            return new ArrStringValue(collection);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m292equalsimpl(Collection<? extends String> collection, Object obj) {
            return (obj instanceof ArrStringValue) && epx.f(collection, ((ArrStringValue) obj).m296unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m293equalsimpl0(Collection<? extends String> collection, Collection<? extends String> collection2) {
            return epx.f(collection, collection2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m294hashCodeimpl(Collection<? extends String> collection) {
            return collection.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m295toStringimpl(Collection<? extends String> collection) {
            return collection.toString();
        }

        public boolean equals(Object obj) {
            return m292equalsimpl(this.value, obj);
        }

        public final Collection<String> getValue() {
            return this.value;
        }

        public int hashCode() {
            return m294hashCodeimpl(this.value);
        }

        public String toString() {
            return m295toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Collection m296unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static Collection<? extends String> m291constructorimpl(Collection<String> collection) {
            return collection;
        }
    }

    /* compiled from: EventItemValue.kt */
    @vby
    public static final class BooleanValue implements EventItemValue {
        private final boolean value;

        private /* synthetic */ BooleanValue(boolean z) {
            this.value = z;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ BooleanValue m297boximpl(boolean z) {
            return new BooleanValue(z);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m299equalsimpl(boolean z, Object obj) {
            return (obj instanceof BooleanValue) && z == ((BooleanValue) obj).m303unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m300equalsimpl0(boolean z, boolean z2) {
            return z == z2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m301hashCodeimpl(boolean z) {
            return Boolean.hashCode(z);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m302toStringimpl(boolean z) {
            return String.valueOf(z);
        }

        public boolean equals(Object obj) {
            return m299equalsimpl(this.value, obj);
        }

        public final boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            return m301hashCodeimpl(this.value);
        }

        public String toString() {
            return m302toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ boolean m303unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static boolean m298constructorimpl(boolean z) {
            return z;
        }
    }

    /* compiled from: EventItemValue.kt */
    @vby
    public static final class FloatValue implements EventItemValue {
        private final float value;

        private /* synthetic */ FloatValue(float f) {
            this.value = f;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FloatValue m304boximpl(float f) {
            return new FloatValue(f);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m306equalsimpl(float f, Object obj) {
            return (obj instanceof FloatValue) && Float.compare(f, ((FloatValue) obj).m310unboximpl()) == 0;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m307equalsimpl0(float f, float f2) {
            return Float.compare(f, f2) == 0;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m308hashCodeimpl(float f) {
            return Float.hashCode(f);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m309toStringimpl(float f) {
            return String.valueOf(f);
        }

        public boolean equals(Object obj) {
            return m306equalsimpl(this.value, obj);
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return m308hashCodeimpl(this.value);
        }

        public String toString() {
            return m309toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ float m310unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static float m305constructorimpl(float f) {
            return f;
        }
    }

    /* compiled from: EventItemValue.kt */
    @vby
    public static final class IntValue implements EventItemValue {
        private final int value;

        private /* synthetic */ IntValue(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ IntValue m311boximpl(int i) {
            return new IntValue(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m313equalsimpl(int i, Object obj) {
            return (obj instanceof IntValue) && i == ((IntValue) obj).m317unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m314equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m315hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m316toStringimpl(int i) {
            return String.valueOf(i);
        }

        public boolean equals(Object obj) {
            return m313equalsimpl(this.value, obj);
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return m315hashCodeimpl(this.value);
        }

        public String toString() {
            return m316toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m317unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m312constructorimpl(int i) {
            return i;
        }
    }

    /* compiled from: EventItemValue.kt */
    @vby
    public static final class LongValue implements EventItemValue {
        private final long value;

        private /* synthetic */ LongValue(long j) {
            this.value = j;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ LongValue m318boximpl(long j) {
            return new LongValue(j);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m320equalsimpl(long j, Object obj) {
            return (obj instanceof LongValue) && j == ((LongValue) obj).m324unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m321equalsimpl0(long j, long j2) {
            return j == j2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m322hashCodeimpl(long j) {
            return Long.hashCode(j);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m323toStringimpl(long j) {
            return String.valueOf(j);
        }

        public boolean equals(Object obj) {
            return m320equalsimpl(this.value, obj);
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            return m322hashCodeimpl(this.value);
        }

        public String toString() {
            return m323toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m324unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m319constructorimpl(long j) {
            return j;
        }
    }

    /* compiled from: EventItemValue.kt */
    @vby
    public static final class MapStringStringValue implements EventItemValue {
        private final Map<String, String> value;

        private /* synthetic */ MapStringStringValue(Map map) {
            this.value = map;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ MapStringStringValue m325boximpl(Map map) {
            return new MapStringStringValue(map);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m327equalsimpl(Map<String, ? extends String> map, Object obj) {
            return (obj instanceof MapStringStringValue) && epx.f(map, ((MapStringStringValue) obj).m331unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m328equalsimpl0(Map<String, ? extends String> map, Map<String, ? extends String> map2) {
            return epx.f(map, map2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m329hashCodeimpl(Map<String, ? extends String> map) {
            return map.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m330toStringimpl(Map<String, ? extends String> map) {
            return map.toString();
        }

        public boolean equals(Object obj) {
            return m327equalsimpl(this.value, obj);
        }

        public final Map<String, String> getValue() {
            return this.value;
        }

        public int hashCode() {
            return m329hashCodeimpl(this.value);
        }

        public String toString() {
            return m330toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Map m331unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static Map<String, ? extends String> m326constructorimpl(Map<String, String> map) {
            return map;
        }
    }

    /* compiled from: EventItemValue.kt */
    @vby
    public static final class StringValue implements EventItemValue {
        private final String value;

        private /* synthetic */ StringValue(String str) {
            this.value = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ StringValue m332boximpl(String str) {
            return new StringValue(str);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m334equalsimpl(String str, Object obj) {
            return (obj instanceof StringValue) && epx.f(str, ((StringValue) obj).m338unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m335equalsimpl0(String str, String str2) {
            return epx.f(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m336hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m337toStringimpl(String str) {
            return str.toString();
        }

        public boolean equals(Object obj) {
            return m334equalsimpl(this.value, obj);
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return m336hashCodeimpl(this.value);
        }

        public String toString() {
            return m337toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m338unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m333constructorimpl(String str) {
            return str;
        }
    }
}
