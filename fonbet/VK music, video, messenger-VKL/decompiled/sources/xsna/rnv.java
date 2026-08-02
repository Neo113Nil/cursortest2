package xsna;

import android.content.Intent;
import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.im.ui.components.viewcontrollers.msg_send.MsgSendHidePopupsReason;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.oz30;
import xsna.qnv;

/* compiled from: IMsgSendVc.kt */
/* loaded from: classes2.dex */
public interface rnv<M extends Msg, SC extends qnv, VC extends oz30<M, SC>> {
    void L();

    default boolean a0() {
        return false;
    }

    default String getText() {
        return "";
    }

    default List<e0l0> r() {
        return EmptyList.b;
    }

    default boolean s() {
        return true;
    }

    default Integer v() {
        return null;
    }

    default void A() {
    }

    default void D() {
    }

    default void m() {
    }

    default void onPause() {
    }

    default void onResume() {
    }

    default void onStart() {
    }

    default void onStop() {
    }

    default void p() {
    }

    default void q() {
    }

    default void y() {
    }

    default void z() {
    }

    default void B(M m) {
    }

    default void C(long j) {
    }

    default void a(MsgSendSource.b bVar) {
    }

    default void b(Bundle bundle) {
    }

    default void g(Bundle bundle) {
    }

    default void h(MsgSendHidePopupsReason msgSendHidePopupsReason) {
    }

    default void i(List<e0l0> list) {
    }

    default void j(boolean z) {
    }

    default void l(long j) {
    }

    default void o(boolean z) {
    }

    default void t(Msg msg) {
    }

    default void u(DialogExt dialogExt) {
    }

    default void w(HashSet hashSet) {
    }

    default void x(int i) {
    }

    default void k(long j, UserId userId) {
    }

    default void n(Bundle bundle, long j) {
    }

    default void onActivityResult(int i, int i2, Intent intent) {
    }
}
