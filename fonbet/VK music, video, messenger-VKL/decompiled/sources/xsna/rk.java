package xsna;

import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class rk implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ xzs e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rk(AccessibilityEvents accessibilityEvents, Collection collection, AccessibilityEvents.i iVar, CallMember callMember) {
        this.c = accessibilityEvents;
        this.d = collection;
        this.e = iVar;
        this.f = callMember;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                AccessibilityEvents accessibilityEvents = (AccessibilityEvents) this.c;
                Collection collection = (Collection) this.d;
                AccessibilityEvents.i iVar = (AccessibilityEvents.i) this.e;
                accessibilityEvents.c("usersJoined(" + collection.size() + ')');
                CallMemberId callMemberId = (CallMemberId) iVar.invoke(this.f);
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    CallMemberId callMemberId2 = (CallMemberId) iVar.invoke(it.next());
                    accessibilityEvents.i.add(callMemberId2);
                    if (!epx.f(callMemberId2, callMemberId)) {
                        AccessibilityEvents.Event event = AccessibilityEvents.Event.USER_JOINED;
                        AccessibilityEvents.Event event2 = AccessibilityEvents.Event.USER_LEFT;
                        if (((Boolean) accessibilityEvents.d.invoke()).booleanValue() && (event2 == null || !accessibilityEvents.e(event2, callMemberId2))) {
                            accessibilityEvents.a(event, callMemberId2);
                        }
                    }
                }
                accessibilityEvents.f();
                break;
            default:
                Group group = (Group) this.c;
                myh myhVar = (myh) this.d;
                flu fluVar = (flu) this.e;
                defpackage.v vVar = (defpackage.v) this.f;
                myhVar.invoke();
                rsg0.y0(new hqu(group.c, (String) null, (String) null, (AdminLeaveAction) null, 30), null, null, 3).subscribe(new st0(new i4h(fluVar, 0), 8), new lf1(new com.vk.im.engine.internal.api_commands.messages.a(vVar, 24), 14));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ rk(j4h j4hVar, Group group, myh myhVar, flu fluVar, defpackage.v vVar) {
        this.c = group;
        this.d = myhVar;
        this.e = fluVar;
        this.f = vVar;
    }
}
