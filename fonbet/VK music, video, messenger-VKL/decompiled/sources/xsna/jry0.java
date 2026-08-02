package xsna;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* compiled from: HttpHeaders.java */
/* loaded from: classes8.dex */
public final class jry0 {
    public Map<String, List<String>> a;

    public static jry0 a(Map<String, List<String>> map, final BiPredicate<String, String> biPredicate) {
        Map<String, List<String>> map2 = (Map) map.entrySet().stream().map(new Function() { // from class: xsna.fry0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final Map.Entry entry = (Map.Entry) obj;
                Stream stream = ((List) entry.getValue()).stream();
                final BiPredicate biPredicate2 = biPredicate;
                List list = (List) stream.filter(new Predicate() { // from class: xsna.iry0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        String str = (String) entry.getKey();
                        return biPredicate2.test(str, (String) obj2);
                    }
                }).collect(Collectors.toList());
                if (list.isEmpty()) {
                    return Optional.empty();
                }
                String str = (String) entry.getKey();
                Objects.requireNonNull(str);
                return Optional.of(new AbstractMap.SimpleImmutableEntry(str, list));
            }
        }).flatMap(new f4l(2)).collect(Collectors.toMap(new gry0(), new hry0()));
        jry0 jry0Var = new jry0();
        jry0Var.a = map2;
        return jry0Var;
    }
}
